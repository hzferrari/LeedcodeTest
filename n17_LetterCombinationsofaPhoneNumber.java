/**17. Letter Combinations of a Phone Number
 *
 *Given a digit string, return all possible letter combinations that the number could represent.

 A mapping of digit to letters (just like on the telephone buttons) is given below.

 Input:Digit string "23"
 Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 Note:
 Although the above answer is in lexicographical order, your answer could be in any order you want.
 *//*

import java.util.*;
public class n17_LetterCombinationsofaPhoneNumber {
    public static void main(String[] args){
        Solution a = new Solution();
        String digits = "";
        System.out.println(a.letterCombinations(digits));
    }
}

class Solution {
    public List<String> letterCombinations(String digits) {

        if(digits.isEmpty())
            return new ArrayList<String>();     //默认初始值为""

        List<String> res = new ArrayList<String>();
        Map<Character,String[]> numToletter = new HashMap<Character,String[]>();

        String[] n2 = {"a","b","c"};
        String[] n3 = {"d","e","f"};
        String[] n4 = {"g","h","i"};
        String[] n5 = {"j","k","l"},
                 n6 = {"m","n","o"},
                 n7 = {"p","q","r","s"},
                 n8 = {"t","u","v"},
                 n9 = {"w","x","y","z"};
        List<String> n1 = new ArrayList<String>();
        numToletter.put('2',n2);
        numToletter.put('3',n3);
        numToletter.put('4',n4);
        numToletter.put('5',n5);
        numToletter.put('6',n6);
        numToletter.put('7',n7);
        numToletter.put('8',n8);
        numToletter.put('9',n9);

        String[] x0 = numToletter.get( digits.charAt(0) );
        for(int i=0; i<x0.length; i++){
            res.add(i, x0[i]);
        }

        if( digits.length()==1 )
            return res;

        int j = 1;
        while( j<digits.length() ){

            String[] x = numToletter.get( digits.charAt(j) );
            List<String> curRes = new ArrayList<String>(res);   //复制最新的res
            res.clear();
            int count = 0;

            for(int m=0; m<curRes.size(); ++m){
                for(int n=0; n<x.length; ++n){
                    res.add(count++, curRes.get(m) + x[n]);    //用List装n1-n9应该更好
                }
            }
            ++j;
        }

        return res;
    }
}*/
