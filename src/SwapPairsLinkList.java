
public class SwapPairsLinkList {
        public static void main(String[] args) {
            ListNode root = new ListNode(5);
            root = new ListNode(4, root);
            root = new ListNode(3, root);
            root = new ListNode(2, root);
            root = new ListNode(1, root);
            ListNode tm = root;
            for (int i = 0; i < 5; i++) {

                System.out.println(tm.val);
                tm = tm.next;
            }

            tm = swapPairs(root);

            for (int i = 0; i < 5; i++) {

                System.out.println(tm.val);
                tm = tm.next;
            }

        }

        private static ListNode swapPairs(ListNode root) {
            ListNode current = root;
            root = root.next;
            ListNode before = null;

            while (current.next != null && current.next.next != null){


                ListNode temp = current.next;
                current.next = current.next.next;
                temp.next = current;
                if (before == null){
                    before = current;}
                else before.next = temp;
                current = current.next;

            }
            return root;
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
