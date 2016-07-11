import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by hzferrari on 2016/3/23.
 */
public class T3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] strs = new String[256];
        Map<String,Integer> m = new HashMap<String,Integer>();
        int i=0;
        while (in.hasNext()){

            String str = new String(in.nextLine());
            System.out.println(str);
            strs[i++] = str;
            if(m.containsKey(str)){
                m.put(str,m.get(str)+1);
            }
            else{
                m.put(str,1);
            }
        }


    }
    private static void search(String str){

    }
}
