import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hzferrari on 2016/3/30.
 */
public class T5 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");
        String time = f.format(date);
        System.out.println(time);
        String str = "123";
        System.out.println(Integer.parseInt(String.valueOf(str)));
    }
    public static void strAppend(String A){
        A = A+"dd";
    }
}
