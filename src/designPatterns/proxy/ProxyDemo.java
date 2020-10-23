package designPatterns.proxy;

import java.lang.reflect.Proxy;

/**
 * ����ģʽʾ��
 * @author Zhang
 * @date 2020/07/12
 * @Description ʹ�ô����������û����������û�����ʵ����ķ���
 */
public class ProxyDemo {

    public static void main(String[] args) {
        // ��ʵ��ί����
        RealSubject realsubject = new RealSubject();

        // ��̬����
        System.out.println("��̬����");
        staticproxy(realsubject);

        // ��̬����
        System.out.println("��̬����");
        dynamicProxy(realsubject);

    }

    private static void staticproxy(Subject realsubject) {
        ProxyStatic p = new ProxyStatic(realsubject);
        // �����˴�������
        p.request();
    }

    private static void dynamicProxy(Subject realsubject) {
        // ����������ö���
        ProxyHandler handler = new ProxyHandler(realsubject);
        // ���ɶ�̬�������ʵ��
        Subject proxySubject = (Subject)Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
            RealSubject.class.getInterfaces(), handler);

        // ͨ�����������÷���
        proxySubject.request();
    }

}
