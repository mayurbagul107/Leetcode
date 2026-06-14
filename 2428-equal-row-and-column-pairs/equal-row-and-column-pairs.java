class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            StringBuilder row = new StringBuilder();
            for(int j=0; j<n; j++) {
                row.append(grid[i][j]).append(", ");
            }
            String key = row.toString();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int count = 0;
        for(int col=0; col<n; col++) {
            StringBuilder column = new StringBuilder();
            for(int row=0; row<n; row++) {
                column.append(grid[row][col]).append(", ");
            }
            String key = column.toString();
            if(map.containsKey(key)) {
                count += map.get(key);
            }
        }
        return count;
    }
}