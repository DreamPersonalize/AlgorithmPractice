package swordoffer.util;

/**
 * Á´±í½Úµã
 * 
 * @author Perso
 * @date 2020/06/21
 * @Description
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        this.val = x;
        this.next = null;
    }

    public void Add(int x) {
        ListNode newNode = new ListNode(x);
        if (this.next == null) {
            this.next = newNode;
        } else {
            this.next.Add(x);
        }
    }

    public void putout() {
        ListNode node = this.next;
        System.out.print(this.val);
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
        }
    }
}
