class Solution {
    public int countNegativesinGrid(int[][] grid) {
        int i = 0;
        int count=0;
        int m = grid.length;
        int n = grid[i].length;
        for(i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                if(grid[i][j]< 0){count=count+1;}
            }
        }
        return count;
    }
}
