package javabase.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * �̵߳Ķ���ʹ��
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
            // �߳��ж�ʵ��
            Thread myThreadOne = new MyThreadOne();
            myThreadOne.start();
            myThreadOne.interrupt();
            System.out.println("main run");
        */

        /**     
            //�жϵ����߳�
            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.execute(() -> {
                try {
                    Thread.sleep(2000);
                    System.out.println("Thread run");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            // executorService.shutdownNow(); //�ս�ȫ���߳�
            Future<?> future = executorService.submit(() -> {
                // ...
            });
            future.cancel(true);
            System.out.println("main run");
        */

        ExecutorService executorService = Executors.newCachedThreadPool();

        // �̵߳Ļ���ͬ��
        SyncDemo sDemo = new SyncDemo();

        /**
            // ������ͬһ������һ���߳�ִ�����ִ������һ���߳�
            executorService.execute(() -> sDemo.fun());
            executorService.execute(() -> sDemo.fun());
        */
        SyncDemo sDemoTwo = new SyncDemo();
        /**
            // �����ڲ�ͬ���󣬶���߳�ͬʱִ�С�
            
            executorService.execute(() -> sDemo.fun());
            executorService.execute(() -> sDemoTwo.fun());
        */

        /**
            // ���߳�ͬ��һ����ʱ������ͬ��һ����ľ�̬����ʱ���߳�������ͬһ����Ĳ�ͬ����
            executorService.execute(() -> sDemo.funTwo());
            executorService.execute(() -> sDemoTwo.funTwo());
        */

        // ReentrantLock
        // ����������Ч��ͬ��������
        LockDemo lockDemo = new LockDemo();
        executorService.execute(() -> lockDemo.func());
        executorService.execute(() -> lockDemo.func());
    }

}

class SyncDemo {
    // ͬ������
    public void fun() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }

    // ͬ����
    public void funTwo() {
        synchronized (SyncDemo.class) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }

    // ͬ����̬��������ͬ����һ����Ч����
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
