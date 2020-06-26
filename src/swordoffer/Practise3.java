package swordoffer;

import java.util.ArrayList;

import swordoffer.util.ListNode;

/**
 * ������ ��β��ͷ��ӡ����
 * 
 * @author Zhang
 * @date 2020/06/21
 * @Description ����һ�������������β��ͷ��˳�򷵻�һ��ArrayList��
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
     * ����ת�б�
     * 
     * @param node
     * @return
     */
    public static ArrayList<Integer> solution(ListNode node) {

        while (node != null) {
            // �����������������ֵʼ�ղ��뵽�б��һ���У����ǵ�����б�
            if (arr == null) {
                arr.add(node.val);
            } else {
                arr.add(0, node.val);
            }

            node = node.next;
        }
        return arr;
    }

    // ��������˼·��ջ������ȳ��������鷴ת���ݹ�
    // �ݹ�汾
    public static ArrayList<Integer> solution2(ListNode node) {
        if (node != null) {
            solution2(node.next);
            arr.add(node.val);
        }
        return arr;
    }
}
