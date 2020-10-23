package javabase.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 创建线程
 * @author zhang
 * @date 2020/07/13
 * @Description
 */
public class threadDemo {

    public static void main(String[] args) throws Exception {
        // 第一种创建线程方法
        new MyThread().start();

        // 第二种创建线程方法
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();

        // 第三种创建线程方法
        // 将Callable包装成FutureTask，FutureTask也是一种Runnable
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(myCallable);
        new Thread(futureTask).start();

        // get方法会阻塞调用的线程
        Integer sum = futureTask.get();
        System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getId());

        // 其他变体写法

        // 匿名内部类
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getId());
            }
        }).start();

        // 尾部代码块，对匿名内部类形式的语法糖
        new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getId());
            }
        }.start();

        // Lamda表达式
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getId());
        };
        new Thread(runnable).start();

    }

}

/**
 * 创建线程 -- 继承Thread类
 * @author Zhang
 * @date 2020/07/13
 * @Description
 */
class MyThread extends Thread {
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getId());

    }
}

/**
 * 创建线程 -- 实现Runnable类
 * @author Zhang
 * @date 2020/07/13
 * @Description
 */
class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getId());
    }

}

/**
 * 创建线程 -- 实现Callable接口
 * @author Perso
 * @date 2020/07/13
 * @Description
 */
class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getId());

        int sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += i;
        }
        Thread.sleep(5000);

        System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getId());
        return sum;
    }

}
