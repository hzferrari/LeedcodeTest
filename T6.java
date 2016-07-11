import java.util.Scanner;

public class T6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] carr = new char[3][3];
        while (sc.hasNext()){
//            int i=0;
//            for(i=0; i<3; i++){
//                String s = sc.nextLine();
//                if(s.length()!=3){
//                    System.out.println("x");
//                    for(int j=3-i; j>0; j--){
//                        sc.nextLine();
//                    }
//                    i=4;
//                }else {
//                    carr[i] = s.toCharArray();
//                }
//            }
//          if(i==4) continue;
            carr[0] = sc.nextLine().toCharArray();
            carr[1] = sc.nextLine().toCharArray();
            carr[2] = sc.nextLine().toCharArray();

            int p2 = isDraw(carr);
            if(p2 == -1){
                System.out.println("x");
                continue;
            }
            int p = isWin(carr);
            if(p2 == 0 && p==3){
                System.out.println("draw");
            }
            else if(p == 1){
                System.out.println("1 won");
            }
            else if(p == 2){
                System.out.println("2 won");
            }
            else{
                System.out.println(Integer.valueOf(p2).toString());
            }

        }
    }
    static int isWin(char[][] carr){
        //检查每行
        for(int i=0; i<3; i++){
            if(carr[i][0]!='.'){
                if(carr[i][0]==carr[0][1] && carr[i][0]==carr[i][2]){
                    return carr[i][0] == 'X'? 1:2;  //先手赢返回1
                }
            }
        }
        //检查每列
        for(int j=0; j<3; j++){
            if(carr[0][j]!='.'){
                if(carr[0][j]==carr[1][j] && carr[0][j]==carr[2][j]){
                    return carr[0][j] == 'X'? 1:2;
                }
            }
        }
        //检查对角线
        if(carr[0][0]!='.'){
            if(carr[0][0]==carr[1][1] && carr[0][0]==carr[2][2]){
                return carr[0][0] == 'X'? 1:2;
            }
        }
        if(carr[0][2]!='.'){
            if(carr[0][2]==carr[1][1] && carr[0][2]==carr[2][0]){
                return carr[0][0] == 'X'? 1:2;
            }
        }
        return 3;

    }
    static int isDraw(char[][] arr){
        int c1=0,c2=0,c3=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(arr[i][j] == 'X') c1++;
                else if(arr[i][j] == '0') c2++;
                else if(arr[i][j] == '.') c3++;
                else return -1;
            }
        }
        if(Math.abs(c1-c2) > 1 || c2>c1) return -1;  //该局不合法
        if(c3 == 0) return 0;   //平局
        else return c1 > c2? 2:1;  //c1大则该后手下了
    }

}

//X0X
//.X.
//.XX
//X0X
//.0.
//.X.​