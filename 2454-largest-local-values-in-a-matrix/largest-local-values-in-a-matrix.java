class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n-2][n-2];
        for(int i=0; i<n-2; i++) {
            for(int j=0; j<n-2; j++) {
                int maxVal = Integer.MIN_VALUE;
                for(int k=i; k<i+3; k++) {
                    for (int m=j; m<j+3; m++) {
                        maxVal = Math.max(maxVal, grid[k][m]);
                    }
                }
                maxLocal[i][j] = maxVal;
            }
        }
        return maxLocal;
    }
}