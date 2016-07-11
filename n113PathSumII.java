/**113. Path Sum II
 *
 Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

 For example:
 Given the below binary tree and sum = 22,
        5
       / \
      4   8
     /   / \
    11  13  4
   /  \    / \
  7    2  5   1
 return
 [
 [5,4,11,2],
 [5,8,4,5]
 ]
 */
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class n113PathSumII {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }

    public class Solution{
        //https://leetcode.com/discuss/79229/my-java-solution-with-dfs-bfs-and-recursion
        private void makeList(List<List<Integer>> list, TreeNode node, List<Integer> path, int sum){
            if(node == null)
                return;
            path.add(node.val);
            if(node.left==null && node.right==null && node.val==sum){
                list.add(path);
                return;
            }
            //makeList(list, node.left,  path, sum-node.val); //这样为什么会超时？
            makeList(list, node.left,  new ArrayList<Integer>(path), sum-node.val);
            makeList(list, node.right, new ArrayList<Integer>(path), sum-node.val);
        }

        public List<List<Integer>> pathSum(TreeNode root, int sum){
            List<List<Integer>> list = new ArrayList<List<Integer>>();

            makeList(list, root, new ArrayList<Integer>(), sum);
            return list;
        }
    }
}
