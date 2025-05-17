package medium.CloneGraph;

import java.util.*;

public class Main {
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
                new Main().cloneGraph(first)
        );
    }

    Map<Integer, Node> visitedNodes = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null)
            return null;
        Node newRoot = new Node(node.val);
        if (node.neighbors == null || node.neighbors.isEmpty())
            return newRoot;

        visitedNodes.put(node.val, newRoot);
        myClone(node.neighbors);


        List<Node> newNodeNeighbours = newRoot.neighbors;
        for (Node oldNodeNeighbor : node.neighbors) {
            newNodeNeighbours.add(visitedNodes.get(oldNodeNeighbor.val));
        }

        return newRoot;
    }

    public void myClone(List<Node> oldNodes) {
        Set<Node> nextNodes = new HashSet<>();
        List<Integer> vals = oldNodes.stream().map(node -> node.val).toList();

        for (Node oldNode : oldNodes) {
            if (!visitedNodes.containsKey(oldNode.val)) {
                visitedNodes.put(oldNode.val, new Node(oldNode.val));
                for (Node oldNodeNeighbour : oldNode.neighbors) {
                    if (!visitedNodes.containsKey(oldNodeNeighbour.val) && !vals.contains(oldNodeNeighbour.val)) {
                        nextNodes.add(oldNodeNeighbour);
                    }
                }
            }
        }

        if (!nextNodes.isEmpty()) {
            myClone(new ArrayList<>(nextNodes));
        }

        for (Node oldNode : oldNodes) {
            Node newNode = visitedNodes.get(oldNode.val);
            List<Node> newNodeNeighbours = newNode.neighbors;
            for (Node oldNodeNeighbor : oldNode.neighbors) {
                newNodeNeighbours.add(visitedNodes.get(oldNodeNeighbor.val));
            }
        }
    }

}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

