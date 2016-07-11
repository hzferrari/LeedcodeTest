/**
 * Created by hzferrari on 2016/1/13.
 */

/*104. Maximum Depth of Binary Tree

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

*/


public class n104MaximumDepthofBinaryTree {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }

    public class Solution {
        public int maxDepth(TreeNode root){
            if(root == null)
                return 0;
            int res = 1;
            int l = maxDepth(root.left);
            int r = maxDepth(root.right);
            return l > r? l+1: r+1;
        }
    }
}

