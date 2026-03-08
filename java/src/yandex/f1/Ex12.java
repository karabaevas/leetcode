package yandex.f1;

public class Ex12 {
    public static void main(String[] args) {
        NumMatrix numMatrix = new NumMatrix(new int[][]{
                new int[]{3,0,1,4,2},
                new int[]{5,6,3,2,1},
                new int[]{1,2,0,1,5},
                new int[]{4,1,0,1,7},
                new int[]{1,0,3,0,5},
        });

        int i = numMatrix.sumRegion(2, 1, 4, 3);
        System.out.println(i);
    }


}

class NumMatrix {
    private int[][] ps;
    private int[][] matrix;

    public NumMatrix(int[][] matrix) {
        ps = new int[matrix.length+1][matrix[0].length+1];
        this.matrix = matrix;
        for (int row = 1; row < ps.length; row++) {
            for (int col = 1; col < ps[0].length; col++) {
                ps[row][col] = ps[row-1][col] + matrix[row-1][col-1] + ps[row][col-1] - ps[row-1][col-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (row2 == row1 && col2 == col1){
            return matrix[row1][col1];
        }

        int i = ps[row2+1][col2+1];
        int i1 = ps[row1][col2+1];
        int i2 = ps[row2+1][col1];
        int i3 = ps[row1][col1];
        return i - i1 - i2 + i3;
    }
}