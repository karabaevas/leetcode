package yandex.f1;

public class Ex16 {
    public static void main(String[] args) {
        Ex16 main = new Ex16();

    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1, right+1};
            }
            if(sum<target){
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{-1,-1};
    }

}
