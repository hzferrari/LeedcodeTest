///**
// * N个小孩手中拿着一个随机数排成一排，现在给小孩子发饼干，每个小孩子都至少能分到一个饼干，手中拿着的数字大的小朋友的饼干数要大于隔壁
// * 小朋友的。请编写程序计算一下：你至少要发多少个饼干。同时针对你写的这段程序给出测试方案。
// */
//public class Main {
//    public static void main(String[] args) {
//        int[] a = {4,3,2,1,4,4,4};
//        System.out.println(maxCookies(a));
//    }
//    private static int maxCookies(int[] arr){
//        if(arr.length <= 0) return 0;
//        int begin = 0, end = 0, mid = 0;
//        int endNum = 1;
//        int sum = 0;
//        while (end<arr.length-1){
//            //升序序列
//            if(arr[end] < arr[end+1]){
//                while(end<arr.length-1 && arr[end] < arr[end+1]){
//                    end++;
//                }
//                if(begin!=0 && arr[begin]>arr[begin-1]){
//                    endNum = (end-begin) + 2;
//                    sum += (2+endNum)*(end-begin+1)/2;   //降序接升序的情况
//                }else {
//                    endNum = end + 1;
//                    sum += (1+endNum)*(end-begin+1)/2;
//                }
//            }
//            //降序序列
//            else if(arr[end] > arr[end+1]){
//                while (end<arr.length-1 && arr[end] > arr[end+1]){
//                    end++;
//                }
//                endNum = 1;
//                sum += (1+end-begin+1)*(end-begin+1)/2;
//            }
//            //连续相等序列
//            else {
//                while (end<arr.length-2 && arr[end]==arr[end+1]){
//                    end++;
//                }
//                if(arr[end] < arr[end+1]){
//                    endNum = 1;
//                    sum += end-begin+1;
//                }
//                else if(arr[end] > arr[end+1]){
//                    mid = end;
//                    while (arr[end] > arr[end+1]){
//                        end++;
//                    }
//                    endNum = end - mid +1;
//                    sum += mid*(mid-begin) + (1+endNum)*(end-mid+1)/2;
//                }
//
//
//            }
//            end++;
//            begin = end;
//
//        }
//        if(end == arr.length-1){
//            if(arr[arr.length-1] > arr[arr.length-2]){
//                sum += endNum+1;
//            }else if(arr[arr.length-1] < arr[arr.length-2]){
//                sum++;
//            }else {
//                sum += endNum;
//            }
//        }
//        if(sum<arr.length){
//            sum = arr.length;
//        }
//        return sum;
//    }
//}
