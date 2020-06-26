package swordoffer;

import swordoffer.util.ListNode;

/**
 * 合并两个排序的链表
 * 
 * @author Zhang
 * @date 2020/06/26
 * @Description 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。 一般创建单链表，都会设一个虚拟头结点，也叫哨兵，因为这样每一个结点都有一个前驱结点。
 */
public class Practice16 {

    public static void main(String[] args) {
        ListNode nodeOne = new ListNode(1);
        nodeOne.Add(3);
        nodeOne.Add(5);
        nodeOne.Add(7);
        nodeOne.Add(9);
        ListNode nodeTwo = new ListNode(2);
        nodeTwo.Add(4);
        nodeTwo.Add(6);
        nodeTwo.Add(8);
        nodeTwo.Add(10);
        mergeOne(nodeOne, nodeTwo).putout();

    }

    /**
     * 非递归方案
     * 
     * @param nodeOne
     * @param nodeTwo
     * @return
     */
    private static ListNode mergeOne(ListNode nodeOne, ListNode nodeTwo) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (nodeOne != null && nodeTwo != null) {
            if (nodeOne.val < nodeTwo.val) {
                cur.next = nodeOne;
                nodeOne = nodeOne.next;
            } else {
                cur.next = nodeTwo;
                nodeTwo = nodeTwo.next;
            }
            cur = cur.next;
        }
        if (nodeOne != null) {
            cur.next = nodeOne;
        }
        if (nodeTwo != null) {
            cur.next = nodeTwo;
        }
        return head.next;
    }

    /**
     * 递归方案
     * 
     * @param nodeOne
     * @param nodeTwo
     * @return
     */
    private static ListNode mergeTwo(ListNode nodeOne, ListNode nodeTwo) {
        if (nodeOne == null) {
            return nodeTwo;
        } else if (nodeTwo == null) {
            return nodeOne;
        } else {
            if (nodeOne.val < nodeTwo.val) {
                nodeOne.next = mergeTwo(nodeOne.next, nodeTwo);
                return nodeOne;
            } else {
                nodeTwo.next = mergeTwo(nodeOne, nodeTwo.next);
                return nodeTwo;
            }
        }
    }

}
