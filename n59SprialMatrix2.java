/**
 * 59. Spiral Matrix II My Submissions Question

 Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

 For example
 Given n = 3,

 You should return the following matrix:
 [
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
 ]
 */
public class n59SprialMatrix2 {
    public static void main(String[] args) {
        Solution59 a = new Solution59();
        int n = 3;
        a.generateMatrix(3);
    }

}
class Solution59 {

    //和n54一样的思路，修改一下
    public int[][] generateMatrix(int n) {

        int[][] res = new int[n][n];
        if( n<=0 )
            return res;

        int k = 1;
        int laryer = (n+1)/2;
        for(int i=0; i<laryer; i++){
            for(int j=i; j<n-i; j++){
                res[i][j] = k++;
            }
            for(int j=i+1; j<n-i; j++){
                res[j][n-i-1] = k++;
            }
            if(n-i-1 > i) {
                for (int j=n-i-1-1; j>=i; j--) {
                    res[n-i-1][j] = k++;
                }
            }
            if(n-i-1 > i){
                for(int j=n-i-1-1; j>i; j--){
                    res[j][i] = k++;
                }
            }
        }
        return res;
    }
}
