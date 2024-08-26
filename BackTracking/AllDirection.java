package BackTracking;

public class AllDirection {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},


        };
        pathObstacles("", board, 0, 0);
    }

    static void pathObstacles(String p, boolean[][] maze, int r, int c) {

        //maze[0] because we are starting from index (0,0)
        //the below line shows the destination
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        //if the obstacle is found, return
        if (!maze[r][c]) {
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
        maze[r][c]  = true;

    }
}
