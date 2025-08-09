class Solution {
    public int[][] flipAndInvertImage(int[][] matrix) {

        int n=matrix.length;
        int[][] res = new int[n][n];
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

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[i][j] = 1-matrix[i][j];
            }
        }
        return res;
    }
}