import java.util.*;

public class Practice2 {
    public static void main(String[] args) {

        FindBottemLeftValue.TreeNode root = new FindBottemLeftValue.TreeNode(18, new FindBottemLeftValue.TreeNode(16, new FindBottemLeftValue.TreeNode(15), new FindBottemLeftValue.TreeNode(13)), new FindBottemLeftValue.TreeNode(16, new FindBottemLeftValue.TreeNode(13), new FindBottemLeftValue.TreeNode(15)));
        System.out.println(inorderTraversal(root));
            }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

        public static List<Integer> inorderTraversal(FindBottemLeftValue.TreeNode root) {
            LinkedList<FindBottemLeftValue.TreeNode> stack = new LinkedList<>();
            LinkedList<Integer> values = new LinkedList<>();

            if(root == null)return values;

            stack.push(root);

            FindBottemLeftValue.TreeNode current = new FindBottemLeftValue.TreeNode();
            while(!stack.isEmpty()){
                current = stack.pop();

                while(current.left != null){
                    stack.push(current);
                    current = current.left;
                }
                values.add(current.val);

                if(current.right != null){
                    stack.push(current.right);
                    continue;

                }

                if (!stack.isEmpty()){
                    stack.peek().left = null;

                }

            }
            return values;

        }
    }



