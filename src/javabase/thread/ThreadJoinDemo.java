package javabase.thread;

/**
 * join 线程协作
 * @author Perso
 * @date 2020/10/22
 * @Description
 */
public class ThreadJoinDemo {
    private class A extends Thread {
        @Override
        public void run() {
            System.out.println("A");
        }
    }

    private class B extends Thread {

        private A a;

        B(A a) {
            this.a = a;
        }

        @Override
        public void run() {
            try {
                a.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");
        }
    }

    public void test() {
        A a = new A();
        B b = new B(a);
        b.start();
        a.start();
    }

    public static void main(String[] args) {
        ThreadJoinDemo example = new ThreadJoinDemo();
        example.test();
    }
}
