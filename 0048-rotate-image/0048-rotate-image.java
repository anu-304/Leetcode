class Solution {
    public void rotate(int[][] matrix) {
        
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int t=matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }

        for(int i=0;i<matrix.length;i++){
            int l=0;
            int r=matrix.length - 1;
            while(l<r){
                int t = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = t;
                l++;
                r--;
            }
        }
    }
}