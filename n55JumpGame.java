/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.

 Each element in the array represents your maximum jump length at that position.

 Determine if you are able to reach the last index.

 For example:
 A = [2,3,1,1,4], return true.
 A.length = 5 = 2+3 = 2+1+1，且3的数值也>=到length-1的距离。

 A = [3,2,1,0,4], return false.
 A.length = 5 = 3+2，但2的数值<到length-1的距离3，故false

 所以从右往左计算就行了，DP问题
 */
public class n55JumpGame {
    public static void main(String[] args) {
        Solution55 a = new Solution55();
        int[] nums = {2,3,1,1,4};
        if(a.canJump(nums))
            System.out.println("true");
        else System.out.println("false");
    }
}
class Solution55 {
    public boolean canJump(int[] nums) {
        if(nums.length == 0)
            return false;
        if(nums.length == 1)    //[0]也算true
            return true;
        int i = nums.length-2;  //要从倒数第二个数开始看，否则[2，0，0]这种会错
        //因为最后一个数其实是几都没关系，可以跳过
        int pOfZero = -1;       //标记0的位置
        boolean flag = false;
        while(i>=0){
            if(nums[i] == 0 && !flag){
                pOfZero = i;
                flag = true;
            }
            else if(flag && nums[i]>(pOfZero-i)){
                flag = false;
            }

            i--;
        }
        if(flag)
            return false;
        else return true;
    }
}