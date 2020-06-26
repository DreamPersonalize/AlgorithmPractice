package swordoffer;

import swordoffer.util.ListNode;

/**
 * ��ת����
 * 
 * @author Perso
 * @date 2020/06/26
 * @Description ����һ��������ת��������������ı�ͷ��
 */
public class Practice15 {

    public static void main(String[] args) {
        ListNode ns = new ListNode(1);
        ns.Add(2);
        ns.Add(5);
        ns.Add(4);
        ns.Add(9);
        ns.Add(7);
        ns.Add(8);
        reverseList(ns).putout();
    }

    /**
     * ����˼�룺���÷�ת ͨ��pre��head��next���죬pre��head������pre��next�ƶ����Ŀ��
     * 
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

}
