package javabase.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程的等待与唤醒
 * @author Zhang
 * @date 2020/10/22
 * @Description
 */
public class WaitNotiyExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        WaitNotiyExample example = new WaitNotiyExample();
        executorService.execute(() -> example.after());
        executorService.execute(() -> example.before());
    }

    public synchronized void before() {
        System.out.println("before");
        notifyAll();
    }

    public synchronized void after() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after");
    }
}
