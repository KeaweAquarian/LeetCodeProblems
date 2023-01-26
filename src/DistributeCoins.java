public class DistributeCoins {
    static int moves;
    public static void main(String[] args) {


        LargestValueTreeRow.TreeNode root = new LargestValueTreeRow.TreeNode(0, new LargestValueTreeRow.TreeNode(0, new LargestValueTreeRow.TreeNode(0), new LargestValueTreeRow.TreeNode(0)), new LargestValueTreeRow.TreeNode(0, new LargestValueTreeRow.TreeNode(0), new LargestValueTreeRow.TreeNode(7)));
        System.out.println(distributeCoins(root));
    }

    private static int distributeCoins(LargestValueTreeRow.TreeNode root) {
        moves = 0;
       giveCoins(root);
        return moves;
    }

    private static int giveCoins(LargestValueTreeRow.TreeNode root) {
        if (root == null) return 0;
        int left = giveCoins(root.left);
        int right = giveCoins(root.right);
        moves += Math.abs(left) + Math.abs(right);
        return root.val + left + right -1;
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
