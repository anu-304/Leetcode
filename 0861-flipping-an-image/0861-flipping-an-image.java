class Solution {
    public int[][] flipAndInvertImage(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            int c=matrix[0].length - 1;
            for(int j=0;j<=c;j++,c--){
                int t = 1 - matrix[i][j];
                matrix[i][j] = 1- matrix[i][c];
                matrix[i][c] = t;
                
            }
        }
        return matrix;
    }
}