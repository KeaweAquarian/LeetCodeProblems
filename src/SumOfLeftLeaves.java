

public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(LargestValueTreeRow.TreeNode root){
        if (root == null)return 0;
        int sumOfLeaves = 0;

        if (root.left != null){
            if (root.left.left == null && root.left.right == null){
                sumOfLeaves += root.left.val;
            }else sumOfLeaves += sumOfLeftLeaves(root.left);
        }

        if (root.right != null){
            if (root.right.right != null || root.right.left != null){
                sumOfLeaves += sumOfLeftLeaves(root.right);
            }
        }
        return sumOfLeaves;
    }
}
