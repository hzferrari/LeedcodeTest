import java.util.ArrayList;
import java.util.List;

/**
 * Write a program to find the n-th ugly number.

 Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.

 Note that 1 is typically treated as an ugly number.

 Hint:

 The naive approach is to call isUgly for every number until you reach the nth one. Most numbers are not ugly. Try to focus your effort on generating only the ugly ones.Show More Hint

 http://www.cnblogs.com/xing901022/p/3796777.html
 我们考虑一个数组，数组存储的是当前的丑数，以后的每个丑数，都是用之前的数组的元素相乘的来的。接下来就是如何得到后面的丑数并保证它是有序的。
 可以想到，数组的第一个元素是1,1与2 3 5分别相乘，可以得到三个值，这三个值里面最小的，肯定就是下一个丑数的最大值，接着max2的下标后移，继续比较。

 */
public class n264UglyNumberII {
    public static void main(String[] args) {
        Solution264 a = new Solution264();
        System.out.println(a.nthUglyNumber(11));
    }
}
class Solution264 {
    public int nthUglyNumber(int n) {
        if( n<=0 ) return 0;

        int[] res = new int[n];
        res[0] = 1;
        int indx2 = 0, indx3 = 0, indx5 = 0;
        int count = 1;
        while(count < n){
            int cur = Math.min(Math.min(2 * res[indx2], 3 * res[indx3]), 5 * res[indx5]);
            res[count] = cur;
            if(cur == 2 * res[indx2]) indx2++;
            if(cur == 3 * res[indx3]) indx3++;
            if(cur == 5 * res[indx5]) indx5++;
            ++count;

        }
        return res[count-1];
    }
}