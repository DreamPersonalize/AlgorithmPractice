package swordoffer;

/**
 * 试题五实现类
 * 
 * @author Zhang
 * @date 2020/06/22
 * @Description
 */
public class Practise5_main {

    public static void main(String[] args) {
        Practise5 practise5 = new Practise5();
        practise5.push(1);
        practise5.push(2);
        practise5.push(3);
        practise5.push(4);
        practise5.push(5);
        System.out.println(practise5.pop());
        System.out.println(practise5.pop());
    }

}
