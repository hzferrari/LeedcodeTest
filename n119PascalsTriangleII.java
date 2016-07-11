/**119. Pascal's Triangle II
 * Given an index k, return the kth row of the Pascal's triangle.

 For example, given k = 3,
 Return [1,3,3,1].
 */
/*
import java.util.ArrayList;
import java.util.List;

public class n119PascalsTriangleII {

    public static void main(String[] args){
        int n=0;
        Solution a=new Solution();
        System.out.println(a.getRow(n));
    }

}
//根据118改的，所以有些细节不够好
class Solution{
    public List<Integer> getRow(int rowIndex){
        rowIndex++;
        List<List<Integer>> res=new ArrayList<List<Integer>>();

        List<Integer> tmp=new ArrayList<Integer>();
        List<Integer> row=new ArrayList<Integer>();
        row.add(1);     //The first row
        res.add(row);
        for(int i=1;i<rowIndex;++i){
            List<Integer> row2=new ArrayList<Integer>();
            //row.clear();  //wrong!the res will be cleared as well
            row2.add(1);
            tmp=res.get(i-1);
            for(int j=0;j<tmp.size()-1;++j){
                row2.add(tmp.get(j)+tmp.get(j+1));
            }
            row2.add(1);
            res.add(row2);
        }
        return res.get(rowIndex-1);
    }
}*/
