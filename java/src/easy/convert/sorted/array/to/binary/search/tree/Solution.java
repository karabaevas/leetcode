package easy.convert.sorted.array.to.binary.search.tree;


import java.util.Arrays;

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

public class Solution {
    public static void main(String[] args) {
        int[] a = new int[]{-10, -3, 0, 5, 9};
        int[] b = new int[]{1, 3};
        int[] c = new int[]{-10, -3, 5, 9};

        System.out.println(new Solution().sortedArrayToBST(a));
//        System.out.println(new Solution().sortedArrayToBST(b));
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        if (nums.length == 1) {
            return new TreeNode(nums[0], null, null);
        }

        int current = nums.length / 2;
        int[] leftArray = Arrays.copyOfRange(nums, 0, current);
        TreeNode leftChild = sortedArrayToBST(leftArray);

        TreeNode rightChild;
        if (nums.length == 2) {
            rightChild = null;
        } else {
            int[] rightArray = Arrays.copyOfRange(nums, current + 1, nums.length);
            rightChild = sortedArrayToBST(rightArray);
        }


        return new TreeNode(nums[current], leftChild, rightChild);
    }
}