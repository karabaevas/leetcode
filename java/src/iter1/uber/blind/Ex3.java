package iter1.uber.blind;

//https://leetcode.com/problems/number-of-islands/
public class Ex3 {

    public int numIslands(char[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    runRecursiveCheck(grid, i, j);
                    res++;
                }
            }
        }

        return res;
    }

    void runRecursiveCheck(char[][] grid, int i, int j) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1) {
            return;
        }

        if (grid[i][j] == '1') {
            grid[i][j] = '2';

            runRecursiveCheck(grid, i - 1, j);
            runRecursiveCheck(grid, i + 1, j);
            runRecursiveCheck(grid, i, j - 1);
            runRecursiveCheck(grid, i, j + 1);
        }
    }
}
