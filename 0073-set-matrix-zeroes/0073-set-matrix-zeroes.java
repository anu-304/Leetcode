class Solution {
    public void setZeroes(int[][] matrix) {
        int col0 = 1;
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    if(j!=0)    matrix[0][j] = 0;
                    else    col0 = 0;
                }
            }
        }

        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int j= 1;j<c;j++){
                    matrix[0][j] = 0;
            }
        }
        if(col0==0){
            for(int i=0;i<r;i++){
                matrix[i][0]=0;
            }
        }
    }
}