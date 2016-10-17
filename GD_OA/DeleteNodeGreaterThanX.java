package oa;

public class DeleteNodeGreaterThanX {
    public static ListNode delete(ListNode head, int value) {
        if (head == null) return null;
        // Dummy head
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        pre.next = head;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val > value) {
                pre.next = cur.next;
            } else {
                pre = pre.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        ListNode h4 = new ListNode(4);
        ListNode h5 = new ListNode(5);
        ListNode h6 = new ListNode(6);

        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        h5.next = h6;

        ListNode res = delete(h1, 6);
        while(res.next != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x){val = x;}
    }
}
