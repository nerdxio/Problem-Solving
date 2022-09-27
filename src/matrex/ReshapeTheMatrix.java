package matrex;

public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int colums = mat[0].length;

        //if the size not same we are going to return the mat
        if((rows*colums) != (r *c)) return mat;

        int [][]outputArray = new int[r][c];
        int row_nums=0,colum_nums=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                outputArray[row_nums][colum_nums]=mat[i][j];
                colum_nums++;
                if(colum_nums == c){
                    colum_nums = 0;
                    row_nums ++;
                }
            }
        }
        return outputArray;
    }
}
