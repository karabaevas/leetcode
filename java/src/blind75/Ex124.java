package blind75;

import easy.maxProduct.Solution;

import java.util.HashMap;
import java.util.Map;

public class Ex124 {
//    int max = Integer.MIN_VALUE;
//
//    public int maxPathSum(TreeNode root) {
//        doCheck(root);
//        return max;
//    }
//
//    public int doCheck(TreeNode root) {
//        if(root == null){
//            return 0;
//        }
//
//        int ls = doCheck(root.left);
//        int rs = doCheck(root.right);
//        int cur = root.val;
//
//        int rs1 = ls+cur;
//        int rs2 = rs+cur;
//        int rs3 = cur;
//
//        int res = Math.max(Math.max(rs1, rs2), rs3);
//        max = Math.max(res, max);
//        max = Math.max(max, ls+rs+cur);
//
//
//        return res;
//    }
}