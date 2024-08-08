package leetcode;

/**
 * 885. Spiral Matrix III
 */
public class SpiralMatrixIII{
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart){
        int len = rows * cols;
        int turn = 0; // 0 right, 1 down, 2 left, 3 up
        int c = 1;
        int stepsLeft = 1;
        int[][] mat = new int[len][2];
        for(int i = 1; i <= len; ++i){
            stepsLeft--;
            mat[i - 1] = new int[]{rStart, cStart};
            if(turn == 0){
                cStart++;
            }else if(turn == 1){
                rStart++;
            }else if(turn == 2){
                cStart--;
            }else{
                rStart--;
            }
            if(stepsLeft == 0){
                turn = (turn + 1) % 4;
                if(turn == 0){
                    c++;
                }else if(turn == 2){
                    c++;
                }
                stepsLeft = c;
            }
            if(i + 1 <= len){
                while(rStart < 0 || rStart >= rows || cStart < 0 || cStart >= cols){
                    if(stepsLeft == 0){
                        turn = (turn + 1) % 4;
                        if(turn == 0){
                            c++;
                        }else if(turn == 2){
                            c++;
                        }
                        stepsLeft = c;
                    }
                    if(turn == 0){
                        cStart++;
                    }else if(turn == 1){
                        rStart++;
                    }else if(turn == 2){
                        cStart--;
                    }else{
                        rStart--;
                    }
                    stepsLeft--;
                }
            }
        }
        return mat;
    }
}
