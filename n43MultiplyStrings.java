/**
 *
 Given two numbers represented as strings, return multiplication of the numbers as a string.
 Note: The numbers can be arbitrarily large and are non-negative.

 */

import java.math.BigInteger;
public class n43MultiplyStrings {
    public static void main(String[] args){
        Solution43 a = new Solution43();
        String num1 = "123";
        String num2 = "456";
        System.out.println(a.multiply(num1,num2));
    }
}

class Solution43 {
    //作弊的BigInteger类
//http://www.2cto.com/kf/201507/418080.html
//    public String multiply(String num1, String num2) {
//        BigInteger tmp1 = new BigInteger(num1);
//        BigInteger tmp2 = new BigInteger(num2);
//        BigInteger res = tmp1.multiply(tmp2);
//        return res.toString();
//    }
//

//  模拟乘法运算的方法：
    //     123*45 =     1  2  3
    //                *    4  5
    //               ------------
    //                 5  10  15
    //              4  8  12
    //             ------------
    //          =   4 13  22  15
    //          =   4 13  23   5
    //          =   4 15   3   5
    //          =   5  5   3   5

    public String multiply(String num1, String num2) {
        int m=num1.length(), n=num2.length(), zero=0;
        int[] a = new int[m], c = new int[m+n];
        for(int i=0,k=m; i<m; i++) a[--k]=num1.charAt(i)-'0';
        for(int i=n-1; i>=0; i--)
            add(c,a,num2.charAt(i)-'0',zero++);
        carry(c);
        int i=m+n;
        while(i>0 && c[--i]==0);
        i++;
        StringBuilder ret = new StringBuilder(i);
        while(i>0) ret.append((char)(c[--i]+'0'));
        return ret.toString();
    }
    void carry(int[] a){
        int i;
        int c = 0;  //进位
        for(int k=0; k<a.length; k++){
            i=a[k]+c;
            a[k]=i%10;  // 只保留个位
            c=i/10;     // 十位是进位
        }
    }
    void add(int[] c, int[] a, int b, int zero){
        for(int i=zero,j=0; j<a.length; j++,i++)
            c[i]+=a[j]*b;
    }
}
//这样写有问题，当resNum超过long的范围时就会出错
//    public String multiply(String num1, String num2) {
//
//        if( num1.isEmpty() || num2.isEmpty() )
//            return null;
//
//
//        // 字符串转数字
//        long Num1 = 0;
//        long Num2 = 0;
//        long factor = 1;
//        for(int i=num1.length()-1; i>=0; i--){
//            Num1 = Num1+( num1.charAt(i)-'0' ) * factor;
//            factor *= 10;
//        }
//        factor = 1;
//        for(int i=num2.length()-1; i>=0; i--){
//            Num2 = Num2+( num2.charAt(i)-'0' ) * factor;
//            factor *= 10;
//        }
//        long resNum = Num1*Num2;
//        return num1.valueOf(resNum);
//
//        //long最大值是9223372036854775807，19位，也就是1000000000^2 < Long.MAX_VALUE
//    }
