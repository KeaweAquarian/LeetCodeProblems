import java.util.LinkedList;
import java.util.Queue;

public class IsCompletetree {
    public static void main(String[] args) {


        LargestValueTreeRow.TreeNode root = new LargestValueTreeRow.TreeNode(0, new LargestValueTreeRow.TreeNode(0, new LargestValueTreeRow.TreeNode(0), new LargestValueTreeRow.TreeNode(0)), new LargestValueTreeRow.TreeNode(0, new LargestValueTreeRow.TreeNode(0), new LargestValueTreeRow.TreeNode()));
        System.out.println(isCompleteTree(root));
    }

    private static boolean isCompleteTree(LargestValueTreeRow.TreeNode root) {
        boolean end = false;
        Queue<LargestValueTreeRow.TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            LargestValueTreeRow.TreeNode current = queue.poll();
            if (current == null) end = true;
            else {
                if (end)return false;
                queue.offer(current.left);
                queue.offer(current.right);
            }
        }
        return true;
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
