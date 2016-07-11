/**
 * Created by hzferrari on 2016/3/19.
 */
public class n50Pow {
    public static void main(String[] args) {
        int i=0, j=1;
        i = i++;
        j = i++;
        System.out.println(i+","+j);
        String[] names = { "Michael", "Orson", "Andrew" };
        // 动态初始化数组
        String[] animal = new String[4];
        // 让animal 指向 namens 数组所引用的数组
        names = animal;

        System.out.println(names.length);
        System.out.println(animal.length);
    }
}
class Solution50 {
    public double myPow(double x, int n) {

        return -1;
    }
}