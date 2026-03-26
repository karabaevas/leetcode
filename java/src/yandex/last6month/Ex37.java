package yandex.last6month;

import java.util.*;

public class Ex37 {
    public static void main(String[] args) {
        Ex37 main = new Ex37();
    }


    Map<String, Integer> map = new HashMap<>();
    List<TreeNode> res = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return res;
    }

    String dfs(TreeNode root){
        if(root == null) return "#";

        String serial = root.val +","+ dfs(root.right) + "," + dfs(root.left);
        Integer counter = map.getOrDefault(serial, 0)+1;
        if(counter == 2){
            res.add(root);
        }
        map.put(serial, counter);

        return serial;
    }
}
