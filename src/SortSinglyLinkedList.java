public class SortSinglyLinkedList {
    public static void main(String[] args){
        ListNode root = new ListNode(5);
        root = new ListNode(1, root);
        root = new ListNode(7, root);
        root = new ListNode(2, root);
        root = new ListNode(8, root);
        ListNode tm = root;
        for (int i = 0; i < 5; i++) {

            System.out.println(tm.val);
            tm = tm.next;
        }

       root = sortLinkedList(root);
        tm = root;
        for (int i = 0; i < 5; i++) {

            System.out.println(tm.val);
            tm = tm.next;
        }
    }

    private static ListNode sortLinkedList(ListNode root) {
        if (root == null || root.next == null) return root;

        //find middle
        ListNode temp = root;
        ListNode slow = root;
        ListNode fast = root;

        while (fast != null && fast.next != null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = null;

       ListNode left = sortLinkedList(root);
       ListNode right = sortLinkedList(slow);

       return myMerge(left, right);
    }

    private static ListNode myMerge(ListNode left, ListNode right) {
        ListNode sortedList = new ListNode(0);
        ListNode sortedCurrent = sortedList;

        while (left != null && right != null){
            if (left.val < right.val){
                sortedCurrent.next = left;
                sortedCurrent = sortedCurrent.next;
                left = left.next;
            }else{
                sortedCurrent.next = right;
                sortedCurrent = sortedCurrent.next;
                right = right.next;
            }

        }

        while (left != null){
            sortedCurrent.next = left;
            sortedCurrent = sortedCurrent.next;
            left = left.next;
        }
        while (right != null){
            sortedCurrent.next = right;
            sortedCurrent = sortedCurrent.next;
            right = right.next;
        }
        return sortedList.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
