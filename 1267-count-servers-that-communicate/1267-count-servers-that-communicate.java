class Solution {
    public int countServers(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[] row = new int[r];
        int[] col = new int[c];
        int total=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    row[i]++;
                    col[j]++;
                    total++;
                }
            }
        }
        int temp=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1 && row[i]==1 && col[j]==1){
                    temp++;
                }
            }
        }
        return total-temp;
    }
}