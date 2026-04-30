package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex199 {
    public static void main(String[] args) {
        Ex199 main = new Ex199();


    }


    public List<Integer> rightSideView(TreeNode root) {
        List<TreeNode> next = new LinkedList<>();
        List<TreeNode> curList = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        if(root == null){
            return new ArrayList<>();
        }

        curList.add(root);

        while (!curList.isEmpty()){
            res.add(curList.getLast().val);

            while (!curList.isEmpty()) {
                TreeNode cur = curList.getFirst();

                if(cur.left != null){
                    next.add(cur.left);
                }
                if(cur.right != null){
                    next.add(cur.right);
                }

                curList.remove(cur);
            }

            curList = next;
            next = new LinkedList<>();
        }

        return res;
    }


}
