package leetcode;

public class Ex404 {
    public static void main(String[] args) {
        Ex404 main = new Ex404();

    }


//    Посчитать количество левых листьев бинарного дерева.
//    Левый - значит левый у своего собственного родителя. Лист - значит у узла нет своих детей. Нужно посчитать количество узлов, которые обладают этими двумя свойствами одновременно.
//
//    Возможное расширение задачи - в узлах дерево записаны некоторые числовые значения. Нужно посчитать их сумму в левых листьях.


    int res = 0;

    int m1(TreeNode root){
       check(root, null);
       return res;
    }

    void check(TreeNode cur, TreeNode parent){
        if(cur == null){
            return;
        }

        if(parent != null && cur.left == null && cur.right == null && parent.left == cur){
            res++;
        }

        check(cur.left, cur);
        check(cur.right, cur);
    }

}
