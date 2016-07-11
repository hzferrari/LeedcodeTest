import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
/**
 * Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

 The same repeated number may be chosen from C unlimited number of times.

 Note:
 All numbers (including target) will be positive integers.
 Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
 The solution set must not contain duplicate combinations.
 For example, given candidate set 2,3,6,7 and target 7,
 A solution set is:
 [7]
 [2, 2, 3]
 */
/*
http://www.oschina.net/code/snippet_2399500_48909
1. 空集
2. 数组先排序
这是标准的DFS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */
public class n39CombinationSum {
    public static void main(String[] args){
        Solution39 a = new Solution39();
        int[] candidates = {2,3,4,7,9};
        int target = 9;
        a.combinationSum(candidates,target);

    }
}
class Solution39 {

    //先设置两个成员变量
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> path = new ArrayList<Integer>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length == 0)
            return res;
        Arrays.sort(candidates);
        dfs(0, 0, candidates, target);
        return res;
    }

    //DFS搜索法，begin是开始索引，sum是当前数值和
    public void dfs(int begin, int sum, int[] candidates, int target){

        if (sum == target) {
            res.add(new ArrayList<Integer>(path));  //这里必须要这样写，不能写成 res.add(path)，否则只是把path的引用加进去了！！
        } else if (sum > target) {
            return;
        } else {
            //在循环里面递归，实现DFS
            for(int i=begin; i<candidates.length; ++i) {
                path.add(candidates[i]);
                dfs(i, sum+candidates[i], candidates, target);
                path.remove(path.size()-1);     //DFS, 一条路径搜索完成后，删掉最后一个元素
            }
        }

    }

}