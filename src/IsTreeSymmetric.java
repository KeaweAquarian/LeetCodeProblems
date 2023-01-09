public class IsTreeSymmetric {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(18, new TreeNode(16, new TreeNode(15), new TreeNode(13)), new TreeNode(16, new TreeNode(13), new TreeNode(15)));
        System.out.println(isTreeSymmetric(root));
    }

    private static boolean isTreeSymmetric(TreeNode root) {
        return isSymmetricHelper(root, root);
    }

    private static boolean isSymmetricHelper(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null)return false;
        return (root1.val == root2.val) && isSymmetricHelper(root1.left, root2.right) && (isSymmetricHelper(root1.right, root2.left));
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
