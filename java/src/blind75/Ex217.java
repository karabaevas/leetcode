package blind75;

import java.util.HashSet;
import java.util.Set;

public class Ex217 {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            boolean res = set.add(num);
            if(!res){
                return true;
            }
        }
        return false;
    }


}
