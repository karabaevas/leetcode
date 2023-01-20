package medium.containerwithmostwater;

import java.util.HashMap;

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;

        int maxHeight = 0;
        int maxArea = 0;
        while (left < right) {
            if (height[left] > maxHeight && height[right] > maxHeight){
                maxHeight = Math.min(height[left], height[right]);
                maxArea = Math.max(maxArea, (right-left)*maxHeight);
            }

            if (height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] ints = {1,8,6,2,5,4,8,3,7};
        System.out.println(new Solution().maxArea(ints));
    }
}