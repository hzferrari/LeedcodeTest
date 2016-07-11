/**
 * Created by hzferrari on 2016/4/2.
 */
public class n137SingleNumberII {
    public static void main(String[] args) {
        int[] nums = {1,3,3,1,7,1,3};
        Solution137 a = new Solution137();
        System.out.println(a.singleNumber(nums));
    }
}

//int 数据共有32位，可以用32变量存储 这 N 个元素中各个二进制位上
//比如10放在数组里面就是flag = {0,1,0,1,0,0,0...0,0};
//
class Solution137 {
    public int singleNumber(int[] A) {
        int result = 0;
        int[] flag = new int[32];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < 32; j++){
                int a = A[i] >> j;
                int b= a%2;         //取最低位，比如j=0时，10=1010，a=10>>0=10,b=a%2=0,得到最后一位为0
                flag[j] += b;
                //flag[j]+=((A[i]>>j)%2); //合起来写的形式
            }
        }
        for (int i = 0; i < 32; i++) {
            if (flag[i] % 3 != 0)
                result += 1 << i;   //1248...比如flag[1]%3 != 0, 说明result的二进制表示法的右起第二位是1
        }
        return result;
    }
}