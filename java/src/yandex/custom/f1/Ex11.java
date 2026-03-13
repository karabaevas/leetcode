package yandex.custom.f1;

public class Ex11 {
    public static void main(String[] args) {
        Ex11 main = new Ex11();
    }


    public int pivotIndex(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        if(nums.length==0){
            return -1;
        }

        int[] sl = new int[nums.length];
        int[] sr = new int[nums.length];


        sl[0] = 0;
        for(int i=1; i<nums.length; i++){
            sl[i] = sl[i-1] + nums[i-1];
        }

        sr[nums.length-2] = 0;
        for(int i=nums.length-2; i>=0; i--){
            sr[i] = sr[i+1] + nums[i+1];
        }

        for(int i=0; i<nums.length; i++){
            if(sr[i]==sl[i]){
                return i;
            }
        }
        return -1;
    }
}
