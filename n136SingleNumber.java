/**
 * 利用异或操作。异或的性质1：交换律a ^ b = b ^ a，性质2：0 ^ a = a。
 *
 * 因为x^a^a = x; 可以利用这个性质找出唯一不重复的数。
 * 比如nums = {1,2,5,2,1} = {01,10,101,10,01};
 *  0^01 = 01; 01^10 = 11; 11^101 = 110;
 *  110^10 = 100; 100^01 = 101 = 5;
 *  其实就是0^5 = 5;
 */
public class n136SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,1};
        Solution136 a = new Solution136();
        System.out.println(a.singleNumber(nums));

    }
}
class Solution136 {
    public int singleNumber(int[] nums) {

        int elem = 0;   //任何数异或0等于其本身
        for(int i=0; i<nums.length; i++){
            elem = elem ^ nums[i];
        }
        return elem;
    }
}