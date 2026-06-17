class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int []result = new int[m * n];
        int idx = 0;
        int row = 0;
        int col = 0;
        int direction = 1; 
        while (idx < m * n) {
            result[idx++] = mat[row][col];
            if(direction == 1) {
                row--;
                col++;
            }
            else {
                row++;
                col--;
            }
            if (row >= m) {
                row = m - 1;
                col += 2;
                direction = 1;   
            }
            else if (col >= n) {
                col = n - 1;
                row += 2;
                direction = -1;
            }
            else if (row < 0) {
                row = 0;
                direction = -1;
            }
            else if (col < 0) {
                col = 0;
                direction = 1;
            }
        }
        return result;
    }
}