import java.util.HashMap;
import java.util.Map;

/**
 * Created by hzferrari on 2016/1/17.
 */
/*
public class n13RomanToInteger {
    public static void main(String[] args){
        Solution a = new Solution();
        System.out.println(a.romanToInt("DCXXI"));
    }
}*/

/*
class Solution{
    public int romanToInt(String s) {
        int res;
        Map Roman = new HashMap<Character,Integer>();

        Roman.put('I',1);
        Roman.put('V',5);
        Roman.put('X',10);
        Roman.put('L',50);
        Roman.put('C',100);
        Roman.put('D',500);
        Roman.put('M',1000);

        res = (Integer)Roman.get(s.charAt(s.length()-1));   //前面必须加(Integer)
        for(int i=s.length()-2; i>=0; --i){

            if((Integer)Roman.get(s.charAt(i)) >= (Integer)Roman.get(s.charAt(i+1)))
                res = res + (Integer)Roman.get(s.charAt(i));
            else
                res = res - (Integer)Roman.get(s.charAt(i));
        }

        return res;
    }
}*/
