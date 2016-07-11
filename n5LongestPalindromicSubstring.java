/**!!!！！！！！！！！！！！！！
 *
 * 5. Longest Palindromic Substring
 * Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000,
 * and there exists one unique longest palindromic substring.
 */
public class n5LongestPalindromicSubstring {
    public static void main(String[] args){
        Solution5 a = new Solution5();
        String s="bbba";
        System.out.println(a.longestPalindrome(s));
    }
}
/*//我的方法输入数据太长时会超时
class Solution{
    public String longestPalindrome(String s) {
        String res="";
        int len = 0,maxlen=0;
        char cfront;
        char cback;
        int i = 0;
        int j = s.length()-1;
        while (i<j){        //两头逼近，顺序前进的话比较难处理ccc这样的字符串
            cfront=s.charAt(i);
            while (j>i){
                cback = s.charAt(j);
                if(cfront == cback){
                    if(isPalindrome(s.substring(i,j+1))){    //参数：beginIndex - 起始索引（包括）
                                                            //      endIndex - 结束索引（不包括）。
                        len = j+1-i;
                        if(len>maxlen) {
                            maxlen = len;
                            res = s.substring(i, j + 1);
                        }
                    }
                }
                --j;
            }
            ++i;
            j = s.length()-1;
        }
        return res;
    }

    private boolean isPalindrome(String ss){
        int i=0;
        int j=ss.length()-1;
        while(i<j){
            if(ss.charAt(i) == ss.charAt(j)){
                ++i;
                --j;
            }
            else
                return false;
        }
        return true;
    }
}*/

//https://leetcode.com/discuss/65163/easy-and-clear-java-solution

class Solution5 {
    public String longestPalindrome(String s) {
        int start=0, end=0;
        int maxLen = 1;
        for(int i = 0; i < s.length(); i++){
            int left = i;
            int right = i;
            while(left>-1 && right<s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
            if(maxLen<right-left+1){
                maxLen = right - left + 1;
                start = left+1;
                end = right-1;
            }
            //如果输入bb，没有下面这段，则只能输出b而不是bb
            left = i;
            right = i+1;
            while(left>-1 && right<s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
            if(maxLen<right-left+1){
                maxLen = right - left + 1;
                start = left+1;
                end = right-1;
            }

        }
        return s.substring(start,end+1);
    }
}

