class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int r=mat.length;
        int c=mat[0].length;
        for(int i=0;i<r;i++){
            sum+=mat[i][i];
            sum+=mat[i][r-1-i];
                
        }
        int mid=r/2;
        if(r%2!=0){
            sum-=mat[mid][mid];
        }
        return sum;
    }
}