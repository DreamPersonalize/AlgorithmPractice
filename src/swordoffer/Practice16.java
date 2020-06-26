package swordoffer;

import swordoffer.util.ListNode;

/**
 * �ϲ��������������
 * 
 * @author Zhang
 * @date 2020/06/26
 * @Description ���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥���������� һ�㴴��������������һ������ͷ��㣬Ҳ���ڱ�����Ϊ����ÿһ����㶼��һ��ǰ����㡣
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
     * �ǵݹ鷽��
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
     * �ݹ鷽��
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
