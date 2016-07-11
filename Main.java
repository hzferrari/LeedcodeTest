import java.util.Scanner;

public class Main {

    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int group = sc.nextInt();
        if(group<=0 || group>=1000)
            return;

        int i=0;
        while (i<group && sc.hasNext()){

            int n = sc.nextInt();
            if(n<=0 || n>1000)
                return;


            int[] nums = new int[n];
            for(int j=0; j<n; j++){
                nums[j] = sc.nextInt();
            }

            System.out.println(Sort(nums));
            i++;
        }

    }

    private static int Sort(int[] nums){
        if(nums.length==0)
            return 0;
        int tmp;
        int count = 0;
        for(int i=0;i<=nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                    count++;
                }
            }
        }
        return count;
    }

}
