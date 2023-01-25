public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode root = new ListNode(5);
        root = new ListNode(4, root);
        root = new ListNode(3, root);
        root = new ListNode(2, root);
        root = new ListNode(1, root);

        ListNode root2 = new ListNode(6);
        root2 = new ListNode(4, root2);
        root2 = new ListNode(3, root2);
        root2 = new ListNode(1, root2);
        root2 = new ListNode(1, root2);

        ListNode tm = mergeTwoLists(root, root2);
        for (int i = 0; i < 11; i++) {
            System.out.println(tm.val);
            tm = tm.next;
        }

    }

    private static ListNode mergeTwoLists(ListNode root, ListNode root2) {
        ListNode temp = new ListNode();
        if (root.val<root2.val){
            temp= root;
            root= root.next;
        }else {
            temp = root2;
            root2 = root2.next;
        }
        ListNode current = temp;

        while (root != null && root2 != null){
            if (root.val < root2.val){
                current.next = root;
                root = root.next;
            }else {
                current.next = root2;
                root2 = root2.next;
            }
            current = current.next;

        }
        if (root != null){
            current.next = root;
            root = root.next;
        }
        if (root2 != null){
            current.next = root2;
            root2 = root2.next;
        }
        return temp;
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
