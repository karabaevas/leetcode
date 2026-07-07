package blind75;

import java.util.HashMap;
import java.util.Map;

public class Ex105 {
//    Map<Integer, Integer> mapIn = new HashMap<>();
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        for(int i = 0; i< inorder.length; i++){
//            mapIn.put(inorder[i], i);
//        }
//
//        int left = 0;
//        int right = preorder.length-1;
//        return doBuild(left, right, left, right, preorder, inorder);
//    }
//
//    TreeNode doBuild(int preStart, int preEnd, int inStart, int inEnd, int[] preorder, int[] inorder){
//        if(preStart > preEnd){
//            return null;
//        }
//
//        TreeNode root = new TreeNode(preorder[preStart]);
//        int inRootIdx = mapIn.get(preorder[preStart]);
//
//        int llen = inRootIdx - inStart;
//        int rlen = inEnd - inRootIdx;
//
//        root.left =  doBuild(preStart+1,       preStart + llen,        inRootIdx-llen, inRootIdx-1,    preorder, inorder);
//        root.right = doBuild(preStart+llen+1,  preEnd,                 inRootIdx+1   , inRootIdx+rlen, preorder, inorder);
//
//        return root;
//    }
}
