import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

 For example:
 Given binary tree {3,9,20,#,#,15,7},
 3
 / \
 9  20
 /  \
 15   7
 return its level order traversal as:
 [
 [3],
 [9,20],
 [15,7]
 ]
 */
public class n102BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {

        char c = Character.MAX_VALUE;
        char c2 = Character.MIN_VALUE;
        System.out.println((int)c);
        Solution102 a = new Solution102();
        Solution102.TreeNode n1 = a.new TreeNode(1);

        n1.right = a.new TreeNode(2);
        a.levelOrder(n1);
    }

}
class Solution102{

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }

    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);
        queue.add(null);
        if(root==null)
            return res;

        while( queue.size()!=0 ){
            //注意：removeFirst是LinkedList里定义的方法，所以创建时要写成
            //LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
            //如果写成List<TreeNode> queue = new LinkedList<TreeNode>()，会找不到removeFIrst方法

            TreeNode node = queue.removeFirst();    //取得并移除队列里第一个元素

            if(node!=null){
                cur.add(node.val);
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);

            }else if( queue.size()!=0 ){
                List<Integer> cur2 = new ArrayList<Integer>(cur);
                res.add(cur2);
                cur.clear();
                queue.add(null);
            }else if(node==null && queue.size()==0){
                res.add(cur);
            }

        }
        return res;
    }
}