package swordoffer;

import java.util.Stack;

/**
 * 试题五 两个栈实现队列
 * 
 * @author Perso
 * @date 2020/06/22
 * @Description 用两个栈来实现一个队列，完成队列的Push和Pop操作。队列中的元素为int类型
 */
public class Practise5 {
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();

    /**
     * 放元素：以stack1为主
     * 
     * @param node
     */
    public void push(int node) {
        stack1.push(node);
    }

    /**
     * 取元素：将A栈倒到B栈中，取最后一个元素，再将B栈数据放回A栈中
     * 
     * @return
     */
    public int pop() {
        while (stack1.size() > 1) {
            stack2.push(stack1.pop());
        }
        int ret = stack1.pop();
        while (stack2.size() > 0) {
            stack1.push(stack2.pop());
        }
        return ret;
    }
}
