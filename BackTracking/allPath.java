package BackTracking;
import java.util.Arrays;
public class allPath {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},


        };
        int [] [] path = new int[board.length][board[0].length];
        allpath("", board, 0, 0 , path , 1);
    }
    static void allpath(String p, boolean[][] maze, int r, int c ,int[][] path ,  int step) {
        //maze[0] because we are starting from index (0,0)
        //the below line shows the destination
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int [ ] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        //if the obstacle is found, return
        if (!maze[r][c]) {
            return;
        }
        //i'm considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
            allpath(p + 'D', maze, r + 1, c,path,step+1);
        }
        if (c < maze[0].length - 1) {
            allpath(p + 'R', maze, r, c + 1,path,step+1);
        }
        if (r > 0) {
            allpath(p + 'U', maze, r - 1, c,path,step+1);
        }
        if (c > 0) {
            allpath(p + 'L', maze, r, c - 1,path,step+1);
        }
        //this line is where the function will be over
        //so before the function gets removed, also remove the changes which was done by this function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
