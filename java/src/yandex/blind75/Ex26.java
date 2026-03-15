package yandex.blind75;

import yandex.blind75.Ex28.TreeNode;

public class Ex26 {
    public static void main(String[] args) {
        Ex26 main = new Ex26();
    }
//    https://leetcode.com/problems/invert-binary-tree/description/
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        } else {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
        }

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

}
