package iter0.blind75;

public class Ex42 {
    public int trap(int[] height) {
        int l = 0;
        int lwall = 0;
        int r = height.length-1;
        int rwall = 0;
        int res = 0;

        while(l < r){
            if(height[l] <= height[r]){
                lwall = Math.max(lwall, height[l]);

                int cur = lwall-height[l];
                res += cur;

                l++;
            } else {
                rwall = Math.max(rwall, height[r]);

                int cur = rwall-height[r];
                res += cur;

                r--;
            }
        }

        return res;
    }
}
