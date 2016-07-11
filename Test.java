/**
 * Created by hzferrari on 2016/1/17.
 */
public class Test {
    public static void main(String[] args) {
        //System.out.println(Integer.MAX_VALUE);
        updateBits(0x400, 0x13,2,6);
    }
    static int updateBits(int n,int m,int i,int j){
        int allOnes = ~0;

        int left = allOnes << (j+1);
        int right = ((1<<i)-1);
        int mask = left|right;
        return 1;
    }
}
