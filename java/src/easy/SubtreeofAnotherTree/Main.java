package easy.SubtreeofAnotherTree;

public class Main {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        boolean result = goNext(root, subRoot);

        return result;
    }

    public boolean goNext(TreeNode root, TreeNode subRoot) {
        boolean checkResult = checkTrees(root, subRoot);

        if (checkResult) {
            return true;
        } else {
            if (root.left != null){
                boolean leftRes = goNext(root.left, subRoot);
                if (leftRes) {
                    return true;
                }
            }
            if (root.right != null){
                boolean rightRes = goNext(root.right, subRoot);
                if (rightRes) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean checkTrees(TreeNode root, TreeNode subRoot) {
        if ((root == null && subRoot != null) || (root != null && subRoot == null)) {
            return false;
        }
        if (root == null && subRoot == null){
            return true;
        }
        if (root.val != subRoot.val) {
            return false;
        }

        boolean resultLeft = checkTrees(root.left, subRoot.left);
        if (resultLeft) {
            boolean resultRight = checkTrees(root.right, subRoot.right);
            if (resultRight) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1, new TreeNode(1), null);
//        TreeNode subroot = new TreeNode(1);

//        TreeNode root = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2, new TreeNode(0), null)), new TreeNode(5));
//        TreeNode subroot = new TreeNode(4, new TreeNode(1), new TreeNode(2));

        TreeNode root = new TreeNode(3, new TreeNode(4, new TreeNode(1), null), new TreeNode(5, new TreeNode(2), null));
        TreeNode subroot = new TreeNode(3, new TreeNode(1), new TreeNode(2));
//
        System.out.println(new Main().isSubtree(root, subroot));
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
