package leetcode;

public class Ex849 {
    public static void main(String[] args) {
        Ex849 main = new Ex849();
    }

    public int maxDistToClosest(int[] seats) {
        int[] dist = new int[seats.length];
        int next = -1;
        for (int i = seats.length - 1; i >= 0 ; -- i) {
            if (seats[i] == 0) {
                if (next == -1) {
                    dist[i] = Integer.MAX_VALUE;
                } else {
                    dist[i] = next - i;
                }
            }
            else {
                next = i;
            }
        }
        int max = 1;
        int prev = Integer.MAX_VALUE;
        for (int i = 0; i < seats.length; ++ i) {
            if (seats[i] == 0) {
                if (prev == Integer.MAX_VALUE) {
                    max = Math.max(max, dist[i]);
                }
                else {
                    int twodists = Math.min(dist[i], i - prev);
                    max = Math.max(max, twodists);
                }
            }
            else {
                prev = i;
            }
        }
        return max;
    }
}
