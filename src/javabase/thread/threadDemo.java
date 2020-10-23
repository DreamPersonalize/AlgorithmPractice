package javabase.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * �����߳�
 * @author zhang
 * @date 2020/07/13
 * @Description
 */
public class threadDemo {

    public static void main(String[] args) throws Exception {
        // ��һ�ִ����̷߳���
        new MyThread().start();

        // �ڶ��ִ����̷߳���
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();

        // �����ִ����̷߳���
        // ��Callable��װ��FutureTask��FutureTaskҲ��һ��Runnable
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(myCallable);
        new Thread(futureTask).start();

        // get�������������õ��߳�
        Integer sum = futureTask.get();
        System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getId());

        // ��������д��

        // �����ڲ���
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getId());
            }
        }).start();

        // β������飬�������ڲ�����ʽ���﷨��
        new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getId());
            }
        }.start();

        // Lamda���ʽ
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getId());
        };
        new Thread(runnable).start();

    }

}

/**
 * �����߳� -- �̳�Thread��
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
 * �����߳� -- ʵ��Runnable��
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
 * �����߳� -- ʵ��Callable�ӿ�
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
