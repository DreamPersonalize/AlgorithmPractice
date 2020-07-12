package designPatterns.proxy;

/**
 * 真实的委托者
 * @author Zhang
 * @date 2020/07/12
 * @Description
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("request");

    }

}
