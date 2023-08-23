import java.util.ArrayList;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1 = new ListNode(4, l1);
        l1 = new ListNode(3, l1);

        ListNode l2 = new ListNode(5);
        l2 = new ListNode(6, l2);
        l2 = new ListNode(4, l2);



    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    return l1;
    }

      public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
