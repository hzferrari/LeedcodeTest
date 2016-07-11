/*
Given a collection of distinct numbers, return all possible permutations.
For example,
[1,2,3] have the following permutations:
[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
关键的就是perm方法的else里面的内容，我的理解是（以求str[] = {"a","b","c"}的排列为例子）：

用i从str[st]做一遍循环：

每一次循环中，都要将str[i]与str[i]互相调换位置：第一次开始，"a"与自己换，这时候，递归调用arrange[str,st + 1, len]

这是在求取str[str...len - 1]的排列即"b","c"的排列；

第二次，"a"与"b"互相调换，递归调用arrange[str,str + 1, len]就是在求取{"a","c"}的排列。

第三次，"a"与"c"互相调换，递归调用arrange[str, str + 1,len]就是在求取"{"b","a}的排列。

下面再以"b","c"的排列求取为例：

首先还是做循环，第一次，"b"与自己调换，这时候，调用arrange[str,st + 1,len], 就是求c的排列。呵呵，这时候终于到了函数递归调用的出口了

: st = len - 1。输出"b"  "c";

第二次，类似的，输出"c","b";

至此，"b" "c"的排列求取完毕。加上前面的a,就输出"a""b""c"  "a""c""b"。

类似的，就可以输出所有的排列了。*/

import java.util.ArrayList;
import java.util.List;

public class n46Permutations {
    public static void main(String[] args){
        Solution46 a = new Solution46();
        int[] nums= {1,2,3,4};
        a.permute(nums);
    }
}
class Solution46 {

    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length <= 0)
            return null;

        perm(nums, 0, nums.length-1);

        return res;

    }
    private void perm(int[] nums, int start, int end){
        List<Integer> cur = new ArrayList<Integer>();
        if(start == end){
            for(int i=0; i<=end; i++){
                cur.add(nums[i]);
            }
            res.add(cur);
        }
        for(int i=start; i<=end; i++){  //（让指针start分别指向每一个数）
            int tmp = nums[start];      //交换数组第一个元素与后续的元素
            nums[start] = nums[i];
            nums[i] = tmp;

            perm(nums, start+1, end);   //后续元素递归全排列

            tmp = nums[start];          //将交换后的数组还原
            nums[start] = nums[i];
            nums[i] = tmp;

        }
    }
}
