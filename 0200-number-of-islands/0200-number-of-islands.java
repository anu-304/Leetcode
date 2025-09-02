class Solution {


    public void mark0(char[][] grid, int i, int j){
        int r = grid.length;
        int c = grid[0].length;

        if(i<0 || j<0){
            return;
        }
        if(i>=r || j>=c)
            return;
        if(grid[i][j]=='0') 
            return;
        
        grid[i][j]='0';

        mark0(grid,i+1,j);
        mark0(grid,i-1,j);
        mark0(grid,i,j+1);
        mark0(grid,i,j-1);
    }

    public int numIslands(char[][] grid) {
        int r= grid.length;
        int c = grid[0].length;
        int count = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    count++;
                    mark0(grid,i,j);
                }
            }
        }
        return count;


    }
}