class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int r=mat.length;
        int c=mat[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    sum+=mat[i][j];
                }
                if((i+j) == (r-1)){
                    sum+=mat[i][j];
                }
            }
        }
        int mid=r/2;
        if(r%2!=0){
            sum-=mat[mid][mid];
        }
        return sum;
    }
}