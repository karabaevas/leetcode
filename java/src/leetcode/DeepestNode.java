package leetcode;

import java.util.ArrayList;
import java.util.List;

public class DeepestNode {
    /** * Дано бинарное дерево, нужно найти и вернуть элемент, * находящийся на максимальной глубине от корня. */
    public static class Node {
        int val;
        Node left;
        Node right;
    }



    public Node getDeepestNode(Node root){
        List<Node> cur = new ArrayList<>();
        List<Node> next = new ArrayList<>();
        cur.add(root);
        Node deepestNode = null;

        while(!cur.isEmpty()){
            deepestNode = cur.getFirst();

            for(Node node: cur){
                if(node.left != null){
                    next.add(node.left);
                }

                if(node.right != null){
                    next.add(node.right);
                }
            }

            cur = next;
            next = new ArrayList<>();
        }

        return deepestNode;
    }



}
