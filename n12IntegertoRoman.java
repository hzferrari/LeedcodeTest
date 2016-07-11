/***ByMyself!***
12. Integer to Roman

Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.public
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
class Solution {
    public String intToRoman(int num) {
       */
/* Map In = new HashMap<Integer,String>();
        In.put(1,"I");
        In.put(5,"V");
        In.put(9,"IX");
        In.put(10,"X");
        In.put(50,"L");
        In.put(100,"C");
        In.put(500,"D");
        In.put(1000,"M");*//*


        String s1="",s2="",s3="",s4="",s5="",s6="",s7="";
        int n;      //最高位
        int rem;    //余数

        n = num / 1000;
        rem = num % 1000;
        for(int i=0; i<n; ++i)
            s1 += "M";  //a[6]

        n = rem / 500;
        rem = rem % 500;
        if(n==1)
            s2 = rem/100==4? "CM" : "D";//a[4]+a[6]:a[5]

        if(s2!="CM"){
            n = rem / 100;
            rem = rem % 100;
            if(n==4)
                s3 = "CD";  //a[4]+a[5]
            else {
                for(int i=0; i<n; ++i)
                    s3 += "C";//a[4]
            }
        }
        else
            rem = rem % 100;

        n = rem / 50;
        rem = rem % 50;
        if(n==1)
            s4 = rem/10==4? "XC" : "L";//a[2]+a[4]:a[3]

        if(s4!="XC"){
            n = rem / 10;
            rem = rem % 10;
            if(n==4)
                s5 = "XL";  //a[2]+a[3]
            else {
                for(int i=0; i<n; ++i)
                    s5 += "X";  //a[2]
            }
        }
        else
            rem = rem % 10;

        n = rem / 5;
        rem = rem % 5;
        if(n==1)
            s6 = rem/1==4? "IX" : "V";//a[0]+a[2]

        if(s6!="IX"){
            n = rem / 1;
            rem = rem % 1;
            if(n==4)
                s7 = "IV";  //a[0]+a[1]
            else {
                for(int i=0; i<n; ++i)
                    s7 += "I";//a[0]
            }
        }

        return s1+s2+s3+s4+s5+s6+s7;
    }
}
*/

//循环的方法
class Solution2 {
    public String intToRoman(int num) {

        String[] s = {"","","","","","","",""};
        String[] Roman={"I","V","X","L","C","D","M"};
        int divisor = 1000;
        int i = 0;
        int j = Roman.length-1;

        //先算出M
        int n = num / divisor;     //最高位
        int rem = num % divisor;   //余数
        for(int k=0; k<n; ++k)
            s[i] += Roman[j];

        while (rem != 0 && i < s.length-2){
            i=i+2;
            j=j-2;
            divisor /= 2;

            n = rem / divisor;
            rem = rem % divisor;
            divisor /= 5;

            if(n==1)
                s[i] = rem/divisor==4? (Roman[j]+Roman[j+2]) : Roman[j+1];

            //if( s[i] != (Roman[j]+Roman[j+2]) )    //错误，比的是地址，需要用equals比数组里的值
            if( !s[i].equals(Roman[j]+Roman[j+2]) ){
                n = rem / divisor;
                rem = rem % divisor;
                if(n==4){
                    s[i+1] = Roman[j] + Roman[j+1];
                }
                else {
                    for(int k=0; k<n; ++k)
                        s[i+1] += Roman[j];
                }
            }
            else{
                rem = rem % divisor;
            }
        }

        String res="";
        for(int k=0; k<s.length; ++k){
            res += s[k];
        }
        return res;
    }
}

public class n12IntegertoRoman {
    public static void main(String[] args){
        Solution2 a = new Solution2();
        System.out.println(a.intToRoman(499));

    }
}