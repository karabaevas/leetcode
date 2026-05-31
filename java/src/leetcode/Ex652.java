package leetcode;

import java.util.HashMap;
import java.util.Map;

class TNode {
    char val = '\0';  // [A-Z]
    TNode left = null;
    TNode right = null;
};

public class Ex652 {
    Map<Integer, TNode> map = new HashMap<>();


    public TNode findDuplicateSubtrees(TNode root) {
        getMask(root);

        return res;
    }

    TNode res = null;

    int getMask(TNode root){
        if(root == null){
            return 0;
        }

        int lmask = getMask(root.left);
        int rmask = getMask(root.right);

        int mask = 1 << (root.val - 'A') | lmask | rmask;

        if(map.get(mask) != null){
            res = root;
        }
        map.put(mask, root);

        return mask;
    }
}

/*
Дано бинарное дерево с выделенным корнем, в каждой вершине которого записано по одной букве A-Z.
Две вершины считаются эквивалентными, если поддеревья этих вершин содержат одинаковое множество (т.е. без учета частот) букв.
нужно найти любую пару эквивалентных вершин.
      A
    /   \
   C     B
  / \   / \
  A D   A  D
 /          \
B            C
*/