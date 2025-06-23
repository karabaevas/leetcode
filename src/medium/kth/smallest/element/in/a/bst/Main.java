package medium.kth.smallest.element.in.a.bst;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println();
    }

    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, Comparator.reverseOrder());
        visitNode(root, pq, k);

        return pq.poll();
    }

    void visitNode(TreeNode root, PriorityQueue<Integer> pq, int k) {
        if (root == null) {
            return;
        } else {
            if (pq.size() < k) {
                pq.add(root.val);
            } else if (pq.size() == k) {
                if (pq.peek() > root.val){
                    pq.poll();
                    pq.add(root.val);
                }
            }
        }

        visitNode(root.left, pq, k);
        visitNode(root.right, pq, k);
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
