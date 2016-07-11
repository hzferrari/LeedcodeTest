/**!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * 3. Longest Substring Without Repeating Characters
 * CGiven a string, find the length of the longest substring without repeating characters. For example,
 * the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.
 * For "bbbbb" the longest substring is "b", with the length of 1.
 *
 找出最长的子串，子串中没有重复的字符。
 比如"abcabcbb" → "abc" → 3
 "abcabcde" → "abcde" → 5
 */
/*
public class n3LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args){
        Solution a = new Solution();
        String s="abcbesz";
        System.out.println(a.lengthOfLongestSubstring(s));
    }
}

//http://blog.csdn.net/feliciafay/article/details/16895637
//学习用boolean数组判断重复字符的方法！
class Solution{
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())
            return 0;
        String res = new String();
        boolean[] isExist = new boolean[256];   //用boolean数组判断重复字符
        for(int i=0;i<isExist.length;++i)
            isExist[i]=false;
        int maxLen = 0 , len = 0;
        int i=0, j=0;   //候选字符串的起点和终点
        while(j<s.length()){
            if(!isExist[s.charAt(j)]){
                isExist[s.charAt(j)] = true; //比如s.charAt(j)='a'，则 isExist[97]=true
                ++j;
            }
            else{
                while (s.charAt(i) != s.charAt(j)){
                    isExist[s.charAt(i)]=false;//新候选字串从第一个重复字符(当s[i] == s[j]时候的i)的后一位开始算，
                                                // 之前的i不算，等效于没有被扫描到，所以设为false.
                    ++i;
                }
                ++i;
                ++j;
            }
            len = j-i;
            maxLen = maxLen>len? maxLen:len;
        }
        return maxLen;

    }
}*/





