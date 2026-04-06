package leetcode;

public class Ex88 {
    public static void main(String[] args) {
        Ex88 main = new Ex88();



    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m-1;
        int i2 = n-1;
        int i = n+m-1;

        while(i>=0 && i2 >=0 && i1 >=0){
            if(nums2[i2] > nums1[i1]){
                nums1[i] = nums2[i2];
                i2--;
            } else {
                nums1[i] = nums1[i1];
                i1--;
            }

            i--;
        }

        if(i1<0){
            while(i2>=0){
                nums1[i] = nums2[i2];
                i2--;
                i--;
            }
        }else {
            while(i1>=0){
                nums1[i] = nums1[i1];
                i1--;
                i--;
            }
        }
    }


}
