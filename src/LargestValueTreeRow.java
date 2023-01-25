import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class LargestValueTreeRow {
    public static void main(String[] args) {


        TreeNode root = new TreeNode(18, new TreeNode(16, new TreeNode(15), new TreeNode(13)), new TreeNode(16, new TreeNode(13), new TreeNode(15)));
        System.out.println(largestValueTreeRow(root));
    }


    private static List<Integer> largestValueTreeRow(TreeNode root) {
        if (root == null)return null;
        List<Integer> largest = new ArrayList<>();
        largestHelperMethod(root, largest, 0);
        return largest;

}

    private static void largestHelperMethod(TreeNode root, List<Integer> largest, int level) {
        if (root == null) return;
        if (level == largest.size())largest.add(root.val);
        else {
            largest.set(level, Math.max(largest.get(level), root.val));
        }
        largestHelperMethod(root.left, largest, level+1);
        largestHelperMethod(root.right, largest, level+1);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
