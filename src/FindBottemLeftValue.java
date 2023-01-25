import java.util.LinkedList;
import java.util.Queue;

public class FindBottemLeftValue {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(18, new TreeNode(16, new TreeNode(15), new TreeNode(13)), new TreeNode(16, new TreeNode(13), new TreeNode(15)));
        System.out.println(findBottemLeft(root));
    }

    private static int findBottemLeft(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            root = queue.poll();

            if (root.right != null)queue.offer(root.right);
            if (root.left != null)queue.offer(root.left);

        }
        return root.val;

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



