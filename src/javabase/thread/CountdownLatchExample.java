package javabase.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 控制一个或多个线程等待多个线程
 * @author Perso
 * @date 2020/10/22
 * @Description
 */
public class CountdownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        final int totalThread = 10;
        CountDownLatch countDownLatch = new CountDownLatch(totalThread);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalThread; i++) {
            executorService.execute(() -> {
                System.out.print("run...");
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        // 使用await等上面的线程都执行完才执行下面的语句
        System.out.println("end");
        executorService.shutdown();
    }

}
