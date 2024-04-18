package leetcode;

/**
 * 463. Island Perimeter
 */
public class IslandPerimeter{
    public int islandPerimeter(int[][] grid){
        int count = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                if(grid[row][col] == 1){
                    count += 4;
                    if(row > 0 && grid[row - 1][col] == 1){
                        count -= 2;
                    }
                    if(col > 0 && grid[row][col - 1] == 1){
                        count -= 2;
                    }
                }
            }
        }
        return count;
    }
}
