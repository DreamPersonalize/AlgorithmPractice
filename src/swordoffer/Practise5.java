package swordoffer;

import java.util.Stack;

/**
 * ������ ����ջʵ�ֶ���
 * 
 * @author Perso
 * @date 2020/06/22
 * @Description ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop�����������е�Ԫ��Ϊint����
 */
public class Practise5 {
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();

    /**
     * ��Ԫ�أ���stack1Ϊ��
     * 
     * @param node
     */
    public void push(int node) {
        stack1.push(node);
    }

    /**
     * ȡԪ�أ���Aջ����Bջ�У�ȡ���һ��Ԫ�أ��ٽ�Bջ���ݷŻ�Aջ��
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
