package designPatterns.proxy;

/**
 * 静态代理模式
 * @author Zhang
 * @date 2020/07/12
 * @Description
 */
public class ProxyStatic implements Subject {

    private Subject subject;

    public ProxyStatic(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("ProxyProcess");
        subject.request();
        System.out.println("PostProcess");
    }

}
