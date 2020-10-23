package designPatterns.proxy;

import java.lang.reflect.Proxy;

/**
 * 代理模式示例
 * @author Zhang
 * @date 2020/07/12
 * @Description 使用代理对象完成用户请求，屏蔽用户对真实对象的访问
 */
public class ProxyDemo {

    public static void main(String[] args) {
        // 真实的委托者
        RealSubject realsubject = new RealSubject();

        // 静态代理
        System.out.println("静态代理");
        staticproxy(realsubject);

        // 动态代理
        System.out.println("动态代理");
        dynamicProxy(realsubject);

    }

    private static void staticproxy(Subject realsubject) {
        ProxyStatic p = new ProxyStatic(realsubject);
        // 代理人处理请求
        p.request();
    }

    private static void dynamicProxy(Subject realsubject) {
        // 创建处理调用对象
        ProxyHandler handler = new ProxyHandler(realsubject);
        // 生成动态代理对象实例
        Subject proxySubject = (Subject)Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
            RealSubject.class.getInterfaces(), handler);

        // 通过代理对象调用方法
        proxySubject.request();
    }

}
