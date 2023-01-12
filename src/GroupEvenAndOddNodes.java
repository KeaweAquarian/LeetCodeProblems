public class GroupEvenAndOddNodes {
    public static void main(String[] args) {
        ListNode root = new ListNode(15);
        root = new ListNode(14, root);
        root = new ListNode(13, root);
        root = new ListNode(12, root);
        root = new ListNode(11, root);
        groupEvenAndOddNodes(root);
        ListNode temp = root;
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }

    }

    private static ListNode groupEvenAndOddNodes(ListNode root) {
        if (root == null) return null;
        ListNode odd = root;
        ListNode even = root.next;
        ListNode evenHead = even;
        while (even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
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
