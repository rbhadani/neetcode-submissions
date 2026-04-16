class Solution {
    public void setZeroes(int[][] matrix) {
        //use first row and col as marker to detect if there is zero in give row and col


        int row = matrix.length;
        int col = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        for(int i=0;i<row;i++){
            if(matrix[i][0]==0)firstRowZero=true;
        }
        for(int j=0;j<col;j++){
            if(matrix[0][j]==0)firstColZero=true;
        }

        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][0]==0 ||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
    if(firstRowZero){
        for(int i=0;i<row;i++){
            matrix[i][0] = 0;
        }
    }
    if(firstColZero){
        for(int j=0;j<col;j++){
            matrix[0][j] = 0;
        }
    }
    }
}

//check if first row col is zero 
//then check other rows and cols and mark them as 0 using markers 
//go and make all 0 
//at last make the first row and col as zero 
