package easy.floodfill;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[][] ints = new int[][]{{1, 0, 1}, {1, 0, 1}};

        int[][] x = main.floodFill(ints, 1, 1, 5);
        System.out.println(x);
    }


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] visited = new boolean[image.length][image[0].length];

        return internalVisitNode(image, sr, sc, color, image[sr][sc], visited);
    }


    private int[][] internalVisitNode(int[][] image, int sr, int sc, int newColor, int oldColor, boolean[][] visited) {
        if (visited[sr][sc]) {
            return image;
        }

        if (image[sr][sc] == oldColor) {
            image[sr][sc] = newColor;
            visited[sr][sc] = true;

            if (sr - 1 >= 0 && (sr - 1) < image.length) {
                internalVisitNode(image, sr-1, sc, newColor, oldColor, visited);
            }
            if (sr + 1 >= 0 && (sr + 1) < image.length) {
                internalVisitNode(image, sr+1, sc, newColor, oldColor, visited);
            }
            if (sc - 1 >= 0 && (sc - 1) < image[0].length) {
                internalVisitNode(image, sr, sc-1, newColor, oldColor, visited);
            }
            if (sc + 1 >= 0 && (sc + 1) < image[0].length) {
                internalVisitNode(image, sr, sc+1, newColor, oldColor, visited);
            }
        }
        return image;
    }
}
