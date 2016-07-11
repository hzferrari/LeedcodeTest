/**118. Pascal's Triangle
 * Given numRows, generate the first numRows of Pascal's triangle.

 For example, given numRows = 5,
 Return

 [
         [1],
        [1,1],
       [1,2,1],
      [1,3,3,1],
     [1,4,6,4,1]
 ]
 */
import java.util.ArrayList;
import java.util.List;
/*
public class n118PascalsTriangle {

    public static void main(String[] args){
        int n=5;
        Solution a=new Solution();
        System.out.println(a.generate(n));
    }

}*/

/*class Solution{
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(numRows==0)
            return res;

        List<Integer> tmp=new ArrayList<Integer>();
        List<Integer> row=new ArrayList<Integer>();
        row.add(1);     //The first row
        res.add(row);
        for(int i=1;i<numRows;++i){
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
        return res;
    }
}*/

