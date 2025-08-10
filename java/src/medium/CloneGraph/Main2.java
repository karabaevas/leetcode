package medium.CloneGraph;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);

//        first.neighbors.add(second);
//        first.neighbors.add(four);
//
//
//        second.neighbors.add(first);
//        second.neighbors.add(three);
//
//        three.neighbors.add(second);
//        three.neighbors.add(four);
//
//        four.neighbors.add(first);
//        four.neighbors.add(three);


        first.neighbors.add(second);
        first.neighbors.add(three);


        second.neighbors.add(first);
        second.neighbors.add(three);

        three.neighbors.add(first);
        three.neighbors.add(second);


        System.out.println(
                new Main2().cloneGraph(first)
        );
    }

    Map<Integer, Node> visitedNodes = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null)
            return null;

        Map<Node, Node> map = new HashMap<>();
        return dfs(node, map);
    }

    public Node dfs(Node node, Map<Node, Node> map){
        Node node1 = map.get(node);
        if (node1 != null){
            return node1;
        }
        Node copy = new Node(node.val);
        map.put(node, copy);

        for (Node neighbor : node.neighbors) {
            copy.neighbors.add(dfs(neighbor, map));
        }

        return copy;
    }
}

