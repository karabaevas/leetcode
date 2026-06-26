package blind75;

public class Ex11 {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;

        int res = 0;
        while(left < right){
            res = Math.max(res, (right-left) * Math.min(heights[left], heights[right]));

            if(heights[left] > heights[right]){
                right--;
            } else {
                left++;
            }
        }

        return res;
    }
}
