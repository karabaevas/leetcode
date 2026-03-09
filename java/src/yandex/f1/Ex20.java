package yandex.f1;

public class Ex20 {
    public static void main(String[] args) {
        Ex20 main = new Ex20();



    }

    public int trap(int[] height) {
        int left=0;
        int right= height.length-1;

        int lmax = height[left];
        int rmax = height[right];

        int result = 0;
        while(left<=right){
            if (lmax < rmax){
                lmax = Math.max(height[left], lmax);
                result += (lmax - height[left]);
                left++;
            } else {
                rmax = Math.max(height[right], rmax);
                result += (rmax - height[right]);
                right--;
            }
        }

        return result;
    }


}
