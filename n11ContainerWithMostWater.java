/**11. Container With Most Water
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines,
 * which together with x-axis forms a container, such that the container contains the most water.

 Note: You may not slant（倾斜） the container.


 */
/*public class n11ContainerWithMostWater {
    public static void main(String[] args){
        Solution a = new Solution();
        int[] ss={2,3,10,5,7,8,9};
        System.out.println(a.maxArea(ss));
    }
}*/
//会超时
/*
class Solution {
    public int maxArea(int[] height) {
        int area=0 ;
        int maxarea=0;
        for(int i=0; i<height.length-1;++i){
            for(int j=i+1; j<height.length; ++j){
                area = (j-i)*Math.min(height[i],height[j]);
                maxarea = area > maxarea ? area : maxarea;
            }
        }
       return maxarea;
    }
}
*/
//https://leetcode.com/discuss/78437/java-3ms-solution-with-step-by-step-explanations-beats-85%25
//这个人的方法好，讲的也详细
//简单来说，先定义left=a0，right=an，假如h(right)<h(left)，则此时right点为容器右壁的情况的最大面积为
// S=（right-left）*h（right），因为若left向右移动，底的长度不断减少，而容器的高也不会超过此时h（right）的高度。
//所以left=a0，right=an，h(right)<h(left)时，记录此时的面积S1，并将right点向左移动，继续循环此过程。
//
//另一个优化点：在right（left同理）移动的途中，记录max（h（right）），
// 如果当前的h（right）小于max（h（right）），则跳过此right计算下一个
/*
class Solution {
    public int maxArea(int[] height) {

        int left=0;
        int right=height.length-1;
        int hmaxright = height[right];
        int hmaxleft = height[left];
        int area = 0;
        int maxarea = 0;

        while (left<right){

            if(height[right] <= height[left]){
                if(height[right] >= hmaxright) {
                    area = (right - left) * height[right];
                    hmaxright = height[right];
                }
                right--;
            }
            else{
                if(height[left] >= hmaxleft){
                    area = (right-left)*height[left];
                    hmaxright = height[left];
                }
                left++;
            }
            maxarea = area > maxarea ? area : maxarea;

        }
        return maxarea;
    }
}*/
