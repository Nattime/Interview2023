package meta.interview;

/*
 * 9/12/24
 * Print all diagonal elements in a matrix in place
 * {{1, 2, 3, 4},
 *  {5, 6, 7, 8},
 *  {9, 10, 11, 12}}
 * Expected:
 *  1
 *  2 5
 *  3 6 9
 *  4 7 10
 *  8 11
 *  12
 */
public class PrintDiagonalMatrix{
    void printDiagonal(int[][] matrix){
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        for(int i = 0; i < colLen; i++){
            int row = 0;
            int col = i;
            while(col >= 0 && row < rowLen){
                System.out.print(matrix[row++][col--] + " ");
            }
            System.out.println();
        }
        for(int i = 1; i < rowLen; i++){
            int col = colLen - 1;
            int row = i;
            while(col >= 0 && row < rowLen){
                System.out.print(matrix[row++][col--] + " ");
            }
            System.out.println();
        }
    }
}
