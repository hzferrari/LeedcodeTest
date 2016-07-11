import java.util.ArrayList;
import java.util.List;

/**125. Valid Palindrome
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *                                      回文                          数字与字母的                  忽略大小写
 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.

 Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.

 For the purpose of this problem, we define empty string as valid palindrome.
 */

//public class n125ValidPalindrome {
//
//
//    public static void main(String[] args){
//        String s="0F";
//        Solution a=new Solution();
//        System.out.println(a.isPalindrome(s));
//    }
//
//}
// class Solution {
//
//
//    public boolean isPalindrome(String s) {
//        if(s.isEmpty())
//            return true;
//        s=s.toLowerCase();      //一定要有左操作数，否则没用
//        List<Character> clist = new ArrayList<Character>();
//
//        for(int i=0;i<s.length();++i){
//            if(s.charAt(i) >='a' && s.charAt(i) <= 'z'
//                    || s.charAt(i) >= '0' && s.charAt(i) <= '9'){
//                clist.add(s.charAt(i));
//            }
//        }
//        int i=0;
//        int j=clist.size()-1;
//        while(i<j){
//            char f=clist.get(i);
//            char b = clist.get(j);
//            if(f==b){
//                ++i;
//                --j;
//            }
//            else
//                return false;
//        }
//        return true;
//    }
//}

