package BackTracking;

import java.util.ArrayList;

public class MazeProblems {
    public static void main(String[] args) {
        //System.out.println(path(3,3));
//        System.out.println(pathdiagonal("" , 3,3));
        boolean[][] board = {
                {true, false, true},
                {true, true, true},
                {true, true, true},


        };
        pathObstacles("", board, 0, 0);
    }

    // for calculating the number of ways
//    static int path(int row, int col) {
//        //base condition
//        if (row == 1 || col == 1) {
//            return 1;
//        }
//        int left = path(row - 1, col);
//        int right = path(row, col - 1);
//        return left + right;
//    }
// for knowing the directions (only down and right)
//    static void way(String p , int r , int c){
//        if ( r == 1 && c == 1){
//            System.out.println(p);
//        }
//        if(r>1){
//            way(p+'D' , r-1,c);
//        }
//        if(c>1){
//            way(p + 'R',r,c-1);
//        }
//
//    }
//    static ArrayList<String> pathdiagonal (String p , int r , int c){
//        if ( r== 1 && c == 1){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//        ArrayList<String> list = new ArrayList<>();
//        if(r>1 && c>1){
//            list.addAll(pathdiagonal(p+'D' , r-1 , c-1));
//        }
//        if(r>1){
//            list.addAll(pathdiagonal(p+'V' , r-1 , c));
//        }
//        if(c>1){
//            list.addAll(pathdiagonal(p+'H' , r,c-1));
//        }
//        return list;
//    }
    static void pathObstacles(String p, boolean[][] maze, int r, int c) {
        //maze[0] because we are starting from index (0,0)
        //the below line shows the destination
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        //if the obstacle is found, return
        if (maze[r][c] == false) {
            return;
        }
        //i'm considering this block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            pathObstacles(p + 'D', maze, r + 1, c);
        }
        if (c < maze.length - 1) {
            pathObstacles(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            pathObstacles(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            pathObstacles(p + 'L', maze, r, c - 1);
        }
        //this line is where the function will be over
        //so before the function gets removed, also remove the changes which was done by this function
        maze[r][c] = true;
    }
}
