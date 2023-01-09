public class MaxDepthTree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(18, new TreeNode(16, new TreeNode(15), new TreeNode(13)), new TreeNode(12));
        System.out.println(maxDepthBot(root));
    }

    private static int maxDepthBot(TreeNode root) {
        if (root == null)return 0;
        int leftDepth = maxDepthBot(root.left);
        int rightDepth = maxDepthBot(root.right);
        return Math.max(leftDepth, rightDepth) +1;

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
