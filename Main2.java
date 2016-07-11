import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        if(len<=0 || len==1) {
            System.out.println(0);
            return;
        }

        while (sc.hasNext()){

            sc.nextLine();
            char[] c = sc.nextLine().toCharArray();
            int[] lags = new int[len];
            int max = Integer.MIN_VALUE;
            int t;
            for(int j=0,k=0; j<2*len-1; j+=2,k++){
                t = Integer.parseInt(String.valueOf(c[j]));
                if(t>max) max = t;
                lags[k] = t;
            }
            char[] c2 = sc.nextLine().toCharArray();
            int[] d = new int[len];
            for(int j=0,k=0; j<2*len-1; j+=2,k++){
                d[k] = Integer.parseInt(String.valueOf(c2[j]));
            }
            System.out.println(func(lags, d, max));

        }

    }
    private static int func(int[] lags, int[] d, int max){
        int bigThanMax = 0;
        int lagLen = lags.length;
        int res = 0;
        //int[] dd = new int[lagLen];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<lagLen; i++){
            if(lags[i] >= max){
                bigThanMax++;
            }
            else {
                list.add(d[i]);
            }
        }
        if(bigThanMax > lagLen/2){
            return res;
        }
        else {
            Collections.sort(list);
            for(int i=0; i<(lagLen/2+1-bigThanMax); i++){
                res = res + list.get(i);
            }
            return res;
        }

    }

}
