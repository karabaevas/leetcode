package medium.rotateimage;



class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] ints = {{1, 2,3,4}, {5, 6,7,8},{9,10,11, 12}, {13,14,15,16}};
        int[][] ints1 = {{1, 2,3}, {4,5,6},{7,8,9}};
        solution.rotate(ints1);
    }

    public void rotate(int[][] matrix) {
        int length = matrix.length;
        int level = 0;
        while (level <= (length-1)/2){
            for (int i = level; i < length-1-level; i++) {
                int index = i;

                int temp = matrix[0+level][index];
                matrix[level][index] = matrix[length-1-index][level];
                matrix[length-1-index][level] = matrix[length -1-level][length -1 - index];
                matrix[length - 1 - level][length -1 - index] = matrix[index][length-1-level];
                matrix[index][length-1-level] = temp;
            }
            ++level;
        }
    }
}