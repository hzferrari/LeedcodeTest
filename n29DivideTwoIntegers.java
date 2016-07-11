/**
 * Divide two integers without using multiplication, division and mod operator.

 If it is overflow, return MAX_INT.
 http://blog.csdn.net/feliciafay/article/details/17780521
 */
public class n29DivideTwoIntegers {
    public static void main(String[] args) {
        Solution29 a = new Solution29();
        System.out.println(a.divide(-2147483648, -1));
    }
}
class Solution29 {

    public int divide(int dividend, int divisor) {
        if(divisor == 0 || dividend==Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int res = 0;
        //long a = Math.abs(dividend);    //wrong!! Math.abs(Integer.MIN_VALUE) = -2147483648
        long a = (long) Math.abs((double)dividend);
        long b = (long) Math.abs((double)divisor);
        while (a>=b){
            long c = b;
            for(int i=0; c<=a; i++){
                a = a-c;
                res = res + (1<<i); //注意！！必须加括号，+符号的优先级大于<<
                c = c<<1;
            }
        }

        if((dividend^divisor) >> 31 == 0)   //int型32位是符号位。同号为0，异号为1。
            return res;
        else
            return -res;

    }
}
