package easy.last.stone.weight;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.lastStoneWeight(new int[] {50, 6, 12, 34, 2,7,4,1,8,1}));
    }

    public int lastStoneWeight1(int[] stones) {
        if (stones.length == 0){
            return 0;
        }
        if (stones.length == 1){
            return stones[0];
        }

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < stones.length; i++) {
            list.add(stones[i]);
        }
        list.sort(Comparator.reverseOrder());

        while (list.size() >= 2) {
            Integer first = list.poll();
            Integer second = list.poll();
            if (Objects.equals(first, second)) {
                continue;
            }

            if (first - second > 0) {
                list.addLast(first-second);
            } else {
                list.addLast(second-first);
            }

            list.sort(Comparator.reverseOrder());
        }

        if (list.size() == 1){
            return list.poll();
        }
        return 0;
    }


    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int max1, max2, newItem = 0;
        if(stones.length == 1){
            return stones[0];
        }
        for(int stone : stones){
            maxHeap.offer(stone);
        }

        while(maxHeap.size() >=2){
            max1 = maxHeap.poll();
            max2 = maxHeap.poll();
            newItem = Math.abs(max1 - max2);
            maxHeap.add(newItem);
        }
        return maxHeap.size() == 1 ? newItem : 0;
    }
}
