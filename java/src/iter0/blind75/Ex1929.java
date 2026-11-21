package iter0.blind75;

public class Ex1929 {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length*2];

        for(int i = 0; i< nums.length*2; i++){
            res[i] = nums[i%nums.length];
        }

        return res;
    }
}
