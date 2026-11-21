//package iter0.blind75;
//
//import java.util.HashMap;
//
//public class Ex133 {
//    Map<Integer, Node> visited = new HashMap<>();
//    public Node cloneGraph(Node node) {
//        if(node == null) return node;
//        return processNode(node);
//    }
//
//    private Node processNode(Node root){
//        if(visited.containsKey(root.val)){
//            return visited.get(root.val);
//        }
//        Node copy = new Node(root.val);
//        visited.put(copy.val, copy);
//
//        List<Node> copyNeighbors = new ArrayList<>();
//        for(Node node: root.neighbors){
//            copyNeighbors.add(processNode(node));
//        }
//
//        copy.neighbors = copyNeighbors;
//
//        return copy;
//    }
//
//}
//
///*
//Definition for a Node.
//class Node {
//    public int val;
//    public List<Node> neighbors;
//    public Node() {
//        val = 0;
//        neighbors = new ArrayList<Node>();
//    }
//    public Node(int _val) {
//        val = _val;
//        neighbors = new ArrayList<Node>();
//    }
//    public Node(int _val, ArrayList<Node> _neighbors) {
//        val = _val;
//        neighbors = _neighbors;
//    }
//}
//*/
