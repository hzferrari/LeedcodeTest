import java.util.*;

/**Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

 For example:

 Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

 Note:
 The order of the result is not important. So in the above example, [5, 3] is also correct.
 Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 你的算法的时间复杂度应为O(n)，你能用空间复杂度O(1)实现吗？
 */
public class n260SingleNumberIII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        Solution260 a = new Solution260();
        a.singleNumber(nums);
    }
}
class Solution260 {
//    public int[] singleNumber(int[] nums) {
//        int[] res = new int[2];
//        if(nums.length<=1) return res;
//
//        Set<Integer> set = new HashSet<Integer>();
//        for(int i=0; i<nums.length; i++){
//            if(set.contains(nums[i])){
//                set.remove(nums[i]);
//            }
//            else{
//                set.add(nums[i]);
//            }
//        }
//        Iterator<Integer> it = set.iterator();
//        for(int i=0;i<res.length; i++){
//            res[i] = it.next();
//        }
//        return res;
//    }
public int[] singleNumber(int[] nums) {
    int[] res = new int[2];
    int result = nums[0];
    for(int i=1;i<nums.length;i++){
        result = result^nums[i];
    }
    res[0] = 0;
    res[1] = 0;
    int n = result & (~(result-1)); //使用n&(~(n-1))可以取出元素的最后一个1的位置。
    for(int i=0;i<nums.length;i++){
        if((n & nums[i])!=0){
            res[0] = res[0] ^ nums[i];
        }else {
            res[1] = res[1] ^ nums[i];
        }
    }
    return res;
}
}