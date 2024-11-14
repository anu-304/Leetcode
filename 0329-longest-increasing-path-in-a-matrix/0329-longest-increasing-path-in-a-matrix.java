class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        // Initialize memoization table
        int[][] memo = new int[m][n];
        int maxPathLength = 0;
        
        // Perform DFS from each cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxPathLength = Math.max(maxPathLength, lip(matrix, i, j, memo));
            }
        }
        
        return maxPathLength;
    }
    
    private int lip(int[][] matrix, int i, int j, int[][] memo) {
        // Check boundaries
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) {
            return 0;
        }
        
        // Return the stored result if already computed
        if (memo[i][j] != 0) {
            return memo[i][j];
        }
        
        // Initialize the current cell's longest path length to 1
        int currentMax = 1;
        
        // Define row and column direction arrays
        int[] rowP = {-1, 0, 0, 1}; // Up, Left, Right, Down
        int[] colP = {0, -1, 1, 0}; // Up, Left, Right, Down
        
        // Explore all four directions
        for (int k = 0; k < 4; k++) {
            int newI = i + rowP[k];
            int newJ = j + colP[k];
            
            // Check if the new position is valid and the value is greater
            if (newI >= 0 && newJ >= 0 && newI < matrix.length && newJ < matrix[0].length && matrix[newI][newJ] > matrix[i][j]) {
                currentMax = Math.max(currentMax, 1 + lip(matrix, newI, newJ, memo));
            }
        }
        
        // Store the result in memoization table and return it
        memo[i][j] = currentMax;
        return currentMax;
    }
}