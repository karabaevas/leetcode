package yandex.last6month;

public class Ex23 {
    public static void main(String[] args) {
        Ex23 main = new Ex23();
    }


    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;

        int result = 0;
        while(l < r){
            result = Math.max(Math.min(height[l], height[r])*(r-l), result);
            if(height[l] < height[r]){
                l++;
            }else {
                r--;
            }
        }
        return result;
    }

}
