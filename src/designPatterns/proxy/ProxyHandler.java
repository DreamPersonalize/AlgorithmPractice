package designPatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��̬����
 * @author Perso
 * @date 2020/07/12
 * @Description
 */
public class ProxyHandler implements InvocationHandler {
    private Subject subject;

    public ProxyHandler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // ����Ԥ������
        System.out.println("=====Before=====");
        // ����RealSubject�еķ���
        Object resultObject = method.invoke(subject, args);

        System.out.println("=====After=====");
        return resultObject;
    }

}
