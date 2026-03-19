package yandex.last6month;

public class Ex18 {
    public static void main(String[] args) {
        Ex18 main = new Ex18();

    }

    public double findMaxAverage(int[] nums, int k) {
        double result = Integer.MIN_VALUE;
        double cur = 0;

        for(int r = 0; r< k; r++){
            cur += nums[r];
        }
        result = cur/(double)k;

        int l = 0;
        for(int r=k; r < nums.length; r++){
            cur=cur - nums[l] + nums[r];
            result = Math.max(cur/k, result);
            l++;
        }

        return result;
    }


}
