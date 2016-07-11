/**1. Two Sum
 * Given an array of integers, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 Please note that your returned answers (both index1 and index2) are not zero-based.(序列从1开始)

 You may assume that each input would have exactly one solution.

 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2
*/

//public class n1TwoSum {
//    public static void main(String[] args){
//        Solution a = new Solution();
//        int[] nums={3, 2, 4};
//        int target = 6;
//        System.out.println(a.twoSum(nums,target));
//    }
//}
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int[] index = new int[2];
//        int x;
//        for(int i=0; i<nums.length-1; ++i){
//            x = target - nums[i];
//            for(int j=i+1; j< nums.length; ++j){
//                if(nums[j] == x){
//                    index[0] = i+1;
//                    index[1] = j+1;
//                    return index;
//                }
//            }
//        }
//        return index;
//    }
//}
