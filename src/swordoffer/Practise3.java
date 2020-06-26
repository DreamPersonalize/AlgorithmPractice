package swordoffer;

import java.util.ArrayList;

import swordoffer.util.ListNode;

/**
 * 试题三 从尾到头打印链表
 * 
 * @author Zhang
 * @date 2020/06/21
 * @Description 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * 
 */
public class Practise3 {
    private static ArrayList<Integer> arr = new ArrayList<Integer>();

    public static void main(String[] args) {
        ListNode node = new ListNode(5);
        node.Add(6);
        node.Add(7);
        node.Add(8);
        node.Add(9);
        // System.out.println(solution(node));
        System.out.println(solution(node));
    }

    /**
     * 链表转列表
     * 
     * @param node
     * @return
     */
    public static ArrayList<Integer> solution(ListNode node) {

        while (node != null) {
            // 正序遍历链表，将最新值始终插入到列表第一个中，便是倒序的列表
            if (arr == null) {
                arr.add(node.val);
            } else {
                arr.add(0, node.val);
            }

            node = node.next;
        }
        return arr;
    }

    // 另外三种思路：栈（后进先出）、数组反转、递归
    // 递归版本
    public static ArrayList<Integer> solution2(ListNode node) {
        if (node != null) {
            solution2(node.next);
            arr.add(node.val);
        }
        return arr;
    }
}
