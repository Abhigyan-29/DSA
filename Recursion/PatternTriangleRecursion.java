package Recursion;

public class PatternTriangleRecursion {
    public static void main(String[] args) {
        triangle(4, 0);
    }

    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            //move to next column
            triangle(r, c + 1);
            System.out.print("*");
        } else {
            //move to next row
            triangle(r - 1, 0);
            System.out.println();
        }
    }
}
