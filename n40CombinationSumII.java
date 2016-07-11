import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

 Each number in C may only be used once in the combination.

 Note:
 All numbers (including target) will be positive integers.
 Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
 The solution set must not contain duplicate combinations.
 For example, given candidate set 10,1,2,7,6,1,5 and target 8,
 A solution set is:
 [1, 7]
 [1, 2, 5]
 [2, 6]
 [1, 1, 6]
 */

public class n40CombinationSumII {
    public static void main(String[] args){
        Solution40 a = new Solution40();
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        a.combinationSum2(candidates, target);

    }
}
class Solution40 {

    //先设置两个成员变量
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> path = new ArrayList<Integer>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates.length == 0)
            return res;
        Arrays.sort(candidates);
        dfs(0, 0, candidates, target);
        return res;
    }

    public void dfs(int begin, int sum, int[] candidates, int target){

        if (sum == target) {
            for(int j=0; j<path.size(); j++){
                System.out.print(path.get(j)+",");
            }
            System.out.println();
            res.add(new ArrayList<Integer>(path));
        } else if (sum > target) {
            return;
        } else {

            for(int i=begin; i<candidates.length; ++i) {
                path.add(candidates[i]);
                dfs(i+1, sum+candidates[i], candidates, target);    //相比n39，改成i+1
                path.remove(path.size()-1);

                //相比n39，加了去掉重复元素，这段必须放在dfs递归语句的后面，否则会漏掉一些解。
                while(i<candidates.length-1 && candidates[i]==candidates[i+1]){
                    ++i;
                }
            }
        }

    }

}