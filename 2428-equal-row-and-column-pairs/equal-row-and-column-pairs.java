class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            StringBuilder row = new StringBuilder();
            for(int j=0; j<n; j++) {
                row.append(grid[i][j]).append(", ");
            }
            String rowStr = row.toString();
            map.put(rowStr, map.getOrDefault(rowStr, 0) + 1);
        }
        int count = 0;
        for(int j=0; j<n; j++) {
            StringBuilder column = new StringBuilder();
            for(int i=0; i<n; i++) {
                column.append(grid[i][j]).append(", ");
            }
            String colStr = column.toString();
            count += map.getOrDefault(colStr, 0);
        }
        return count;
    }
}