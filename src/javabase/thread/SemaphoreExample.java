package javabase.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Semaphore 用以控制互斥资源的访问线程数
 * @author Perso
 * @date 2020/10/22
 * @Description 
 *      模拟了对某个服务的并发请求，每次只能有 3 个客户端同时访问，请求总数为 10。
 */
public class SemaphoreExample {

    public static void main(String[] args) {
        final int clientCount = 2; // 客户端数
        final int totalRequestCount = 10; // 总请求数
        Semaphore semaphore = new Semaphore(clientCount);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalRequestCount; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire(); // 获取
                    System.out.print(semaphore.availablePermits() + " ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release(); // 释放
                }
            });
        }
        executorService.shutdown();
    }

}
