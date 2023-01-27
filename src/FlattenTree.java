import java.util.HashMap;
import java.util.Stack;

public class FlattenTree {

    public static void main(String[] args) {


        LargestValueTreeRow.TreeNode root = new LargestValueTreeRow.TreeNode(0, new LargestValueTreeRow.TreeNode(0, new LargestValueTreeRow.TreeNode(0), new LargestValueTreeRow.TreeNode(0)), new LargestValueTreeRow.TreeNode(0, new LargestValueTreeRow.TreeNode(0), new LargestValueTreeRow.TreeNode()));
       flattenTree(root);
    }

    private static void flattenTree(LargestValueTreeRow.TreeNode root) {
        if (root == null)return;

        Stack<LargestValueTreeRow.TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            LargestValueTreeRow.TreeNode current = stack.pop();

            if (current.right != null){
                stack.push(current.right);
            }
            if (current.left != null){
                stack.push(current.left);
            }
            if (!stack.isEmpty())current.right = stack.peek();

            current.left = null;
        }

    }


    public static class TreeNode {
        int val;
        LargestValueTreeRow.TreeNode left;
        LargestValueTreeRow.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, LargestValueTreeRow.TreeNode left, LargestValueTreeRow.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
