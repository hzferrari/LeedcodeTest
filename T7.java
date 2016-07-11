/**
 * 运算步骤如下：//By MoreWindows( http://blog.csdn.net/MoreWindows )
 设有a = 3，b = 6。
 a　　　　0011
 b　　　　0110
 不进位和 0101  = 5
 进位         0010  = 2
 因此 a + b就变成了5 + 2 << 1
 然后有
 5　　　　0101
 2<<1 　　0100
 不进位和 0001  = 1
 进位          0100  = 4
 因此 a + b就变成了1 + 4 << 1
 然后有
 1　　　　0001
 4<<1 　　1000
 不进位和 1001  = 9
 进位          0000  = 0
 当时进位为0时，不进位和为9即a + b之和。


 */
public class T7 {
    int x;
    public static void main(String[] args) {
        System.out.println(T7.add(3, 8));
        T7 a = new T7(128);
        T7 b = a;
        a.x = 2;
        a.x = 128;
    }
    T7(int x){
        this.x = x;
    }
    //使用异或^得到不带进位的结果，使用&得到进位，重复操作直至没有进位。
    private static int add(int n1,int n2){
        int a, b=-1;
        while (b!=0){
            a = n1 ^ n2;    //计算不带进位的加法结果
            b = (n1 & n2) << 1;    //计算进位的位置，并左移一位

            n1 = a;
            n2 = b;
        }
        return n1;
    }

}
