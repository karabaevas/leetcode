package yandex.f1;

public class Ex19 {
    public static void main(String[] args) {
        Ex19 main = new Ex19();

//        main.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        main.trap(new int[]{4,2,0,3,2,5});
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
