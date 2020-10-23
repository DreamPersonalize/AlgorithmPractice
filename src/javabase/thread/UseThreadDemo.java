package javabase.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程的而简单使用
 * @author zhang
 * @date 2020/10/22
 * @Description
 */
public class UseThreadDemo {

    private static class MyThreadOne extends Thread {
        @Override
        public void run() {
            /** interruptedException
            try {
                Thread.sleep(2000);
                System.out.println("Thread run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            */

            while (!interrupted()) {
                System.out.println("eee");
                // ...
            }
            System.out.println("Thread end");
        }
    }

    public static void main(String[] args) {
        /**     
            // 线程中断实例
            Thread myThreadOne = new MyThreadOne();
            myThreadOne.start();
            myThreadOne.interrupt();
            System.out.println("main run");
        */

        /**     
            //中断单个线程
            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.execute(() -> {
                try {
                    Thread.sleep(2000);
                    System.out.println("Thread run");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            // executorService.shutdownNow(); //终结全部线程
            Future<?> future = executorService.submit(() -> {
                // ...
            });
            future.cancel(true);
            System.out.println("main run");
        */

        ExecutorService executorService = Executors.newCachedThreadPool();

        // 线程的互斥同步
        SyncDemo sDemo = new SyncDemo();

        /**
            // 作用于同一个对象，一个线程执行完才执行另外一个线程
            executorService.execute(() -> sDemo.fun());
            executorService.execute(() -> sDemo.fun());
        */
        SyncDemo sDemoTwo = new SyncDemo();
        /**
            // 作用于不同对象，多个线程同时执行。
            
            executorService.execute(() -> sDemo.fun());
            executorService.execute(() -> sDemoTwo.fun());
        */

        /**
            // 当线程同步一个类时，或者同步一个类的静态方法时，线程作用于同一个类的不同对象
            executorService.execute(() -> sDemo.funTwo());
            executorService.execute(() -> sDemoTwo.funTwo());
        */

        // ReentrantLock
        // 锁方法（等效于同步方法）
        LockDemo lockDemo = new LockDemo();
        executorService.execute(() -> lockDemo.func());
        executorService.execute(() -> lockDemo.func());
    }

}

class SyncDemo {
    // 同步方法
    public void fun() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }

    // 同步类
    public void funTwo() {
        synchronized (SyncDemo.class) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }

    // 同步静态方法（和同步类一样的效果）
    public static void funThree() {
        synchronized (SyncDemo.class) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }
}

class LockDemo {
    private Lock lock = new ReentrantLock();

    public void func() {
        lock.lock();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        } finally {
            lock.unlock();
        }
    }
}
