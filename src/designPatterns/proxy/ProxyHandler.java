package designPatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
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
        // 定义预处理工作
        System.out.println("=====Before=====");
        // 调用RealSubject中的方法
        Object resultObject = method.invoke(subject, args);

        System.out.println("=====After=====");
        return resultObject;
    }

}
