package yandex.blind75;

import java.util.ArrayList;
import java.util.List;

public class Ex30 {
    public static void main(String[] args) {
        Ex30 main = new Ex30();



    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> levelResult = new ArrayList<>();

        List<TreeNode> childs = new ArrayList();
        childs.add(root);
        List<TreeNode> next = new ArrayList();

        while(childs.size() > 0){
            for(int i=0; i< childs.size(); i++){
                TreeNode cur = childs.get(i);
                TreeNode left =cur.left;
                TreeNode right =cur.right;
                if(left != null){
                    next.add(left);
                }
                if(right != null){
                    next.add(right);
                }

                levelResult.add(cur.val);
            }
            result.add(levelResult);
            childs = next;
            next = new ArrayList<>();
            levelResult = new ArrayList<>();
        }

        return result;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
