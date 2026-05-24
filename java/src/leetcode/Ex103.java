package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Ex103 {
    public static void main(String[] args) {
        Ex103 main = new Ex103();



    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return List.of();
        }

        List<List<TreeNode>> preRes = new ArrayList<>();
        List<TreeNode> cur = new ArrayList<>();
        List<TreeNode> next = new ArrayList<>();

        cur.add(root);

        while(!cur.isEmpty()){
            preRes.add(cur);

            for(int i = 0; i< cur.size(); i++){
                if(cur.get(i).left != null){
                    next.add(cur.get(i).left);
                }
                if(cur.get(i).right != null){
                    next.add(cur.get(i).right);
                }
            }

            cur = next;
            next = new ArrayList<>();
        }


        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i< preRes.size(); i++){
            List<Integer> curLevel = new ArrayList<>();
            List<TreeNode> levelNodes = preRes.get(i);
            if(i % 2 == 0){
                for(int j =0; j< levelNodes.size(); j++){
                    curLevel.add(levelNodes.get(j).val);
                }
            } else {
                for(int j=levelNodes.size()-1; j >= 0; j--){
                    curLevel.add(levelNodes.get(j).val);
                }
            }

            res.add(curLevel);
        }
        return res;
    }

}
