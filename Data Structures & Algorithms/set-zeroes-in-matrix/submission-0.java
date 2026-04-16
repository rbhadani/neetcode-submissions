class Solution {
    public void setZeroes(int[][] matrix) {
       HashSet<Integer> rowSet = new HashSet<>();
       HashSet<Integer> colSet = new HashSet<>();
       int m = matrix.length;
       int n = matrix[0].length;

       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(matrix[i][j]==0){
                rowSet.add(i);
                colSet.add(j);
            }
        }
       }
       for(int row : rowSet){
        for(int j=0;j<n;j++){
            matrix[row][j] = 0;
        }
       }
       for(int col : colSet){
        for(int i=0;i<m;i++){
            matrix[i][col] = 0;
        }
       }
    }
}
