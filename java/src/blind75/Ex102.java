package blind75;

import java.util.HashMap;
import java.util.Map;

public class Ex102 {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        Map<Integer, List<Integer>> map = new HashMap<>();
//        goDeeper(0, root, map);
//        return new ArrayList(map.values());
//    }
//
//    public void goDeeper(int level, TreeNode root, Map<Integer, List<Integer>> map){
//        if(root == null) return;
//
//        List<Integer> list = map.getOrDefault(level, new ArrayList());
//        list.add(root.val);
//        map.put(level, list);
//
//        level++;
//        goDeeper(level, root.left, map);
//        goDeeper(level, root.right, map);
//    }
}
