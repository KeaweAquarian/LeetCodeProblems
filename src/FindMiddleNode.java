public class FindMiddleNode {
    public static void main(String[] args) {
       ListNode root = new ListNode(1);
        root = new ListNode(2, root);
        root = new ListNode(3, root);
        root = new ListNode(4, root);
        root = new ListNode(5, root);
        System.out.println(findMiddleNode(root).val);
    }

    private static ListNode findMiddleNode(ListNode root) {
        ListNode fast = root;
        ListNode slow = root;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
