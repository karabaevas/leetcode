package leetcode;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList();
        }
        List<List<Integer>> res = new ArrayList<>();
        goDeeper(res, root, 0);

        return res;
    }

    public void goDeeper(List<List<Integer>> res, TreeNode root, int level){
        if(root == null){
            return;
        }

        int size = res.size();
        if(size > level) {
            List<Integer> list = res.get(level);
            list.add(root.val);
        }else {
            List<Integer> list = new ArrayList();
            res.add(list);
            list.add(root.val);
        }

        level++;
        goDeeper(res, root.left, level);
        goDeeper(res, root.right, level);
    }
}