import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AddTwoNumbers {
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(9);
//        l1 = new ListNode(4, l1);
//        l1 = new ListNode(6, l1);
//        l1 = new ListNode(5, l1);
//
//
//        ListNode l2 = new ListNode(9);
//        l2 = new ListNode(4, l2);
//        l2 = new ListNode(2, l2);
//
//
//        ListNode listNode = new ListNode();
//        listNode = addTwoNumbers(l1, l2);
//
//        while(listNode != null){
//            System.out.println(listNode.val);
//            listNode = listNode.next;
//        }

int i = 0;

        for (int j = 0; j < 5; j++) {
             i++;
        }
        System.out.println(i);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode();
        StringBuilder val1 = new StringBuilder();
        StringBuilder val2 = new StringBuilder();
        while (l1 != null){
            val1.append(l1.val+"");
            l1 = l1.next;
        }
        val1 = val1.reverse();

        while (l2 != null){
            val2.append(l2.val+"");
            l2 = l2.next;
        }
        val2 = val2.reverse();

        int value = Integer.valueOf(val1.toString())  + Integer.valueOf(val2.toString());

        Stack<Integer> stack = new Stack<>();
        while((value) > 10){
            int currentInt = value % 10;
            stack.push(currentInt);
            value = value/10;

        }
        stack.push(value);

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
