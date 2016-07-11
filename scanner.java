import java.util.Scanner;

/**
 * Created by hzferrari on 2016/3/29.
 */
public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){

            int r = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            //System.out.println(sc.next());
            int step;
            if( (x1-x)%(2*r)!=0 || (y1-y)%(2*r)!=0 )
                return;
            else {
                step = Math.abs((x1-x)/(2*r))+ Math.abs((y1 - y)/(2*r));
            }
            System.out.println(step);
        }

    }
  //  private int Sort(int[] nums){
       //
   // }
}
