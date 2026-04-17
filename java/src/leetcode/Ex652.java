package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex652 {
    public static void main(String[] args) {
        Ex652 main = new Ex652();



    }

    Map<String, Integer> map = new HashMap<>();
    List<TreeNode> res = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        if(root == null){
            return null;
        }

        String key = toString(root);
        int counter = map.getOrDefault(key , 0);
        if(counter == 1){
            res.add(root);
        }
        counter++;
        map.put(key, counter);

        findDuplicateSubtrees(root.left);
        findDuplicateSubtrees(root.right);
        return res;
    }

    String toString(TreeNode root){
        if(root == null){
            return "#";
        }
        return "v="+root.val + "l=" + toString(root.left) + "r=" + toString(root.right);
    }

}
