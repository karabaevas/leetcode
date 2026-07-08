package blind75;

import java.util.HashMap;
import java.util.Map;

public class Ex297 {

//    // Encodes a tree to a single string.
//    public String serialize(TreeNode root) {
//        return serializeInner(root, new StringBuilder()).toString();
//    }
//
//    StringBuilder serializeInner(TreeNode root, StringBuilder sb){
//        if(root == null){
//            sb.append("#");
//            sb.append(",");
//            return sb;
//        } else {
//            sb.append(root.val);
//            sb.append(",");
//        }
//
//        serializeInner(root.left, sb);
//        serializeInner(root.right, sb);
//
//        return sb;
//    }
//
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//        String[] arr = data.split(",");
//        if(arr.length == 1 && arr[0].equals("#")){
//            return null;
//        }
//
//        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
//        desInner(root, 1, arr);
//
//        return root;
//    }
//
//    int desInner(TreeNode root, int i, String[] arr){
//        int newi = i;
//        if(arr[newi].equals("#")){
//            root.left = null;
//            newi++;
//        } else {
//            root.left = new TreeNode(Integer.parseInt(arr[newi]));
//            newi = desInner(root.left, newi+1, arr);
//        }
//
//        if(arr[newi].equals("#")){
//            root.right = null;
//            newi++;
//        } else {
//            root.right = new TreeNode(Integer.parseInt(arr[newi]));
//            newi = desInner(root.right, newi+1, arr);
//        }
//
//        return newi;
//    }
}
