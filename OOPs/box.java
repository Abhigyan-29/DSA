package OOPs;


public class box {
    double l;
    double h;
    double w;

    static void greeting() {
        System.out.println("hey i'm in static box");
    }

    box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;

    }

    box(double l, double h, double w) {
        System.out.println("box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    //cube
    box(double side) {
        this.w = side;
        this.l = side;
        this.h = side;

    }

    box(box old) {
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    public void information() {
        System.out.println("Running the box");
    }
}

