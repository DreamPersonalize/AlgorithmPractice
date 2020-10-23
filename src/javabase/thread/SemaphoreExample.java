package javabase.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Semaphore ���Կ��ƻ�����Դ�ķ����߳���
 * @author Perso
 * @date 2020/10/22
 * @Description 
 *      ģ���˶�ĳ������Ĳ�������ÿ��ֻ���� 3 ���ͻ���ͬʱ���ʣ���������Ϊ 10��
 */
public class SemaphoreExample {

    public static void main(String[] args) {
        final int clientCount = 2; // �ͻ�����
        final int totalRequestCount = 10; // ��������
        Semaphore semaphore = new Semaphore(clientCount);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalRequestCount; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire(); // ��ȡ
                    System.out.print(semaphore.availablePermits() + " ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release(); // �ͷ�
                }
            });
        }
        executorService.shutdown();
    }

}
