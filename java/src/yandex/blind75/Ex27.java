package yandex.blind75;

public class Ex27 {
    public static void main(String[] args) {
        Ex27 main = new Ex27();



    }

    private int goDeeper(Ex28.TreeNode root, int counter){
        if(root == null){
            return counter;
        }
        int lcounter = counter;
        int rcounter = counter;

        int rl = goDeeper(root.left, ++lcounter);
        int rr = goDeeper(root.right, ++rcounter);

        return Math.max(rr,rl);
    }
//    https://leetcode.com/problems/maximum-depth-of-binary-tree/


}
