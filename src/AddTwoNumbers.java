import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1 = new ListNode(4, l1);
        l1 = new ListNode(6, l1);
        l1 = new ListNode(5, l1);


        ListNode l2 = new ListNode(9);
        l2 = new ListNode(4, l2);
        l2 = new ListNode(2, l2);


        ListNode listNode = new ListNode();
        listNode = addTwoNumbers(l1, l2);

        while(listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }



    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode();
        int val1 = 0;
        int val2 = 0;
        while (l1 != null){
            val1 = l1.val + val1 * 10;
            l1 = l1.next;
        }
        while (l2 != null){
            val2 = l2.val + val2*10;
            l2 = l2.next;
        }
        val1 = val1 + val2;

        Stack<Integer> stack = new Stack<>();
        while((val1) > 10){
            int currentInt = val1 % 10;
            stack.push(currentInt);
            val1 = val1/10;

        }
        stack.push(val1);

        if(stack.peek()>9){
         temp.val = 1;
         temp = new ListNode(0, temp);
         stack.pop();
        }else temp.val = stack.pop();

        while (!stack.isEmpty())temp = new ListNode(stack.pop(), temp);


        return temp;
    }

      public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
