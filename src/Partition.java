import java.util.LinkedList;

public class Partition {
    public static void main(String[] args) {
       ListNode root = new ListNode(5);
        root = new ListNode(1, root);
        root = new ListNode(3, root);
        root = new ListNode(4, root);
        root = new ListNode(1, root);
        ListNode tm = root;
        for (int i = 0; i < 5; i++) {

            System.out.println(tm.val);
            tm = tm.next;
        }
       root = partitions(root, 4);
        tm = root;
        for (int i = 0; i < 5; i++) {

            System.out.println(tm.val);
            tm = tm.next;
        }
    }

    private static ListNode partitions(ListNode root, int i) {
        ListNode less = null;
        ListNode notLess = null;
        ListNode tempRoot = null;
        ListNode tempNotLess = null;

        while (root != null){
            if (root.val < i){
                if (tempRoot == null){
                    less = root;
                    tempRoot = less;
                    root = root.next;
                }else {

                    less.next = root;
                    less = less.next;
                    root = root.next;
                }
            }else {
                if (tempNotLess == null){
                    notLess = root;
                    tempNotLess = notLess;
                    root = root.next;
                }else {

                    notLess.next = root;
                    notLess = notLess.next;
                    root = root.next;
                }
            }
        }
        less.next = tempNotLess;
        return tempRoot;

    }

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
