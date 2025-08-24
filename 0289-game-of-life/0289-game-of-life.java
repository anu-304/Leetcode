class Solution {
    public void gameOfLife(int[][] board) {
        int[] neighbors = {0,1,-1};
        int row=board.length;
        int col=board[0].length;

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){

                int liveNeighbors = 0;
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        if(!(neighbors[i]==0 && neighbors[j]==0)){
                            int a = r+neighbors[i];
                            int b = c+neighbors[j];
                            if((a<row && a>=0) && (b<col && b>=0) && (Math.abs(board[a][b])==1)){
                                liveNeighbors +=1;
                            }
                        }
                    }
                }
                if(board[r][c]==1 && (liveNeighbors<2 || liveNeighbors>3)){
                    board[r][c]=-1;
                }
                if(board[r][c]==0 && liveNeighbors==3){
                    board[r][c]=2;
                }
            }
        }
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(board[r][c]==-1){
                    board[r][c]=0;
                }
                else if(board[r][c]==2){
                    board[r][c]=1;
                }
            }
        }

    }
}