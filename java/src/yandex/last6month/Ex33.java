package yandex.last6month;

import java.util.*;

public class Ex33 {
    public static void main(String[] args) {
        Ex33 main = new Ex33();

    }

    public int numIslands(char[][] grid) {
        int result = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col=0; col < grid[0].length; col++){
                result += dfs(grid, row, col);
            }
        }

        return result;
    }

    private int dfs(char[][] grid, int row, int col){
        if(row<0 || row >= grid.length || col < 0 || col >= grid[0].length){
            return 0;
        }

        if(grid[row][col] == '1'){
            grid[row][col]='0';

            dfs(grid, row-1,col);
            dfs(grid, row+1,col);
            dfs(grid, row,col-1);
            dfs(grid, row,col+1);

            return 1;
        }

        return 0;
    }

}
