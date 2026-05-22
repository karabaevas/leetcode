package leetcode;

public class Ex19 {
    public static void main(String[] args) {
        Ex19 main = new Ex19();



    }

    Node res = null;
    public Node m(Node head,  int n) {
        return res;
    }

    int go(Node head,  int n){
        if(head.next != null){
            int level = go(head.next, n);
            level++;

            if(level == n){
                res = head;
            }

            return level;
        }
        return 0;
    }
}
