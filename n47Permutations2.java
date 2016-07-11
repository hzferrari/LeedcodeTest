import java.util.*;

/**
 * Created by hzferrari on 2016/3/14.
 */
public class n47Permutations2 {

    public static void main(String[] args){
        Solution47 a = new Solution47();
        int[] nums= {0,1,0,0,9};
        a.permuteUnique(nums);
        String s = "123";
        int i = 456;
        String t = String.valueOf(i);
        System.out.println();
    }
}
class Solution47 {

    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        if(nums.length <= 0)
            return null;

        perm(nums, 0, nums.length-1);

        return res;

    }
    private void perm(int[] nums, int start, int end){
        List<Integer> cur = new ArrayList<Integer>();
        if(start == end+1){             //这里要改成end+1，不知道为什么！！
            for(int i=0; i<=end; i++){
                cur.add(nums[i]);
                System.out.print(nums[i]);
            }
            res.add(cur);
            System.out.println();
        }
        else {
            //Arrays.sort(nums, start, end + 1);
            Set<Integer> set = new HashSet<Integer>();
            for (int i = start; i <= end; i++) {  //（让指针start分别指向每一个数）
                //if (i != start && nums[i] == nums[i - 1])
                //    continue;
                if(set.add(nums[i])){
                    int tmp = nums[start];      //交换数组第一个元素与后续的元素
                    nums[start] = nums[i];
                    nums[i] = tmp;

                    perm(nums, start + 1, end);   //后续元素递归全排列

                    tmp = nums[start];          //将交换后的数组还原
                    nums[start] = nums[i];
                    nums[i] = tmp;
                }


            }
        }
    }
}
