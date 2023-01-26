import java.util.ArrayList;
import java.util.List;

public class IsAUniVlauedTree {
    public static void main(String[] args) {


        LargestValueTreeRow.TreeNode root = new LargestValueTreeRow.TreeNode(1, new LargestValueTreeRow.TreeNode(1, new LargestValueTreeRow.TreeNode(1), new LargestValueTreeRow.TreeNode(1)), new LargestValueTreeRow.TreeNode(1, new LargestValueTreeRow.TreeNode(1), new LargestValueTreeRow.TreeNode(1)));
        System.out.println(isAUniValuedTree(root));
    }

    private static boolean isAUniValuedTree(LargestValueTreeRow.TreeNode root) {
        boolean left = root.left == null || root.left.val == root.val && isAUniValuedTree(root.left);
        boolean right = root.right == null || root.right.val == root.val && isAUniValuedTree(root.right);
        return left && right;
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
