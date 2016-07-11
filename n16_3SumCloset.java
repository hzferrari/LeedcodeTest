/**16. 3Sum Closest
 Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 For example, given array S = {-1 2 1 -4}, and target = 1.

 The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */

import java.util.Arrays;

/*public class n16_3SumCloset {

    public static void main(String[] args){
        Solution a = new Solution();
        int[] nums = new int[]{1,2,4,8,16,32,64,128};
        int target = 82;
        System.out.println(a.threeSumClosest(nums,target));
    }
}*/
/*
class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);  //升序排序
        int sum = 0;
        int closestSum = nums[0]+nums[1]+nums[nums.length-1];   //需要初始化一个值

        for(int it=0; it<nums.length; ++it){

            int ft = it+1;          //it，ft，bk相当于三个指针
            int bk = nums.length-1;

            while(ft<bk){       //it固定时，ft和bk分别从it+1到end两头逼近

                sum = nums[it]+nums[ft]+nums[bk];
                if(sum<target){
                    ++ft;
                }
                else if(sum>target){
                    --bk;
                }
                else
                    return sum;
                closestSum = Math.abs(target-sum)<Math.abs(target-closestSum)? sum : closestSum;

            }

            if(closestSum>target)   //closestSum>target，再向右移动it，只会让closestSum更大，所以可以结束比较了
                break;
        }

        return closestSum;
    }
}
*/
