class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //linear search
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;

        
       /* //binary search - since the given array is sorted
        int row= matrix.length;
        int col=matrix[0].length;
        int left=0;
        int right=row*col -1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            int r = mid/col;
            int c = mid%col;
            int guess=matrix[r][c];
            if(guess==target)
            {
                return true;
            }
            else if(guess<target)
            {
                left=mid+1;
            }
            else
            {   
                right=mid-1;
            }
        }
        return false; */
    }
}