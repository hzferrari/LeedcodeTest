import javax.swing.plaf.synth.SynthEditorPaneUI;

/**
 * Created by hzferrari on 2016/3/23.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] n = {1,35,3,0,566,-1,4,2,66,99,2,-1};
        sort a = new sort();
        a.QuickSort(n,0,n.length-1);
        for(int i=0; i<n.length; ++i)
            System.out.print(n[i] + " ");
    }
}
class sort{

    public void QuickSort(int[] n, int left, int right){
        int par;
        if(left<right){
            par = partition(n, left, right);
            QuickSort(n, left, par-1);
            QuickSort(n, par+1, right);
        }
    }

    private int partition(int[] n, int left, int right){
        int pivot = n[left];
        while(left<right){

            while (left<right && n[right] >= pivot )
                right--;
            if(left<right)
                n[left] = n[right];

            while (left<right && n[left] <= pivot )
                left++;
            if(left<right)
                n[right] = n[left];

        }
        n[left] = pivot;
        return left;
    }
}