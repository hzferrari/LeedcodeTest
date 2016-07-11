import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * http://www.cnblogs.com/ganganloveu/p/4157376.html
 *
 * 54. Spiral Matrix
 * Given a matrix of m x n elements (m rows, n columns),
 * return all elements of the matrix in spiral order.For example,
 * Given the following matrix:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * You should return [1,2,3,6,9,8,7,4,5].
 */
public class n54SpiralMatrix {
    public static void main(String[] args) {
        Solution a = new Solution();
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        a.spiralOrder(matrix);
    }
}
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if(matrix.length == 0)
            return res;

        int m = matrix.length;
        int n = matrix[0].length;
        int laryer = (Math.min(m,n) + 1) / 2;
        for(int i=0; i<laryer; i++){
            for(int j=i; j<n-i; j++){
                res.add(matrix[i][j]);
            }
            for(int j=i+1; j<m-i; j++){
                res.add(matrix[j][n-i-1]);
            }
            if(m-i-1 > i) {
                for (int j = n - i - 1 - 1; j >= i; j--) {
                    res.add(matrix[m-i-1][j]);
                }
            }
            if(n-i-1 > i){
                for(int j=m-i-1-1; j>i; j--){
                    res.add(matrix[j][i]);
                }
            }

        }
        return res;
    }
}