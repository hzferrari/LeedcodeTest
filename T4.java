import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hzferrari on 2016/3/26.
 */
public class T4 {
//    public static void main(String[] args) {
//        int n = 4;
//        System.out.println(2<<n);
//    }
//
//    static List GrayCode(int n){
//
//        String[] res = new String[2<<(n-1)];
//
//        if(n==1){
//            res[0] = "0";
//            res[1] = "1";
//        }
//        else {
//            while (n>0){
//
//                n--;
//            }
//        }
//        return res;
//    }
//
//    static void reverse(int[] arr){
//        int tmp;
//        int fr = 0;
//        int bk = arr.length-1;
//        while (fr<bk){
//
//            tmp = arr[fr];
//            arr[fr] = arr[bk];
//            arr[bk] = tmp;
//            ++fr;
//            --bk;
//        }
//    }
public static void main(String[] args) {
    String[] codes = createGrayCode(3);
    System.out.println(Arrays.toString(codes));
}

    public static String[] createGrayCode(int n){
    String[] codes = new String[2 << (n - 1)];
    createGrayCode(codes, n);
    return codes;
}
    enum a {
        U,D
    }
    private static void createGrayCode(String[] codes, int n){
        if(n == 1){
            codes[0] = "0";
            codes[1] = "1";
        }else{
            createGrayCode(codes, n - 1);
            int len = 2 << (n - 1);
            int half = len >> 1;
            for(int i = len - 1,j = 0; i >= 0; i--){
                if(i < half){
                    codes[i] = "0" + codes[--j];
                }else{
                    codes[i] = "1" + codes[j++];
                }
            }
        }

    }


}

