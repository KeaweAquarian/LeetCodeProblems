import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class WidthOfBinaryTree {
    static  int maxWidth;
   static HashMap<Integer, Integer> leftMost;
    public static void main(String[] args) {


        LargestValueTreeRow.TreeNode root = new LargestValueTreeRow.TreeNode(0, new LargestValueTreeRow.TreeNode(0, new LargestValueTreeRow.TreeNode(0), new LargestValueTreeRow.TreeNode(0)), new LargestValueTreeRow.TreeNode(0, new LargestValueTreeRow.TreeNode(0), new LargestValueTreeRow.TreeNode()));
        System.out.println(widthOfBinaryTree(root));
    }

    private static int widthOfBinaryTree(LargestValueTreeRow.TreeNode root) {
        maxWidth = 0;
        leftMost = new HashMap<>();
        getWidth(root, 0, 0);
        return maxWidth;
    }

    private static void getWidth(LargestValueTreeRow.TreeNode root, int depth, int position) {
        if (root == null)return;

        leftMost.computeIfAbsent(depth, x->position);
        maxWidth = Math.max(maxWidth, position-leftMost.get(depth)+1);

        getWidth(root.left, depth+1, position*2);
        getWidth(root.right, depth+1, position*2+1);
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
