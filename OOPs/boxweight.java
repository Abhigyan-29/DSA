package OOPs;

public class boxweight extends box{
    double weight;

    public boxweight() {
        this.weight = -1;
        //l  cant be used here as it uses private.
        //private can only be used in its own file/class .
     //   System.out.println(this.l);
      //  System.out.println(super.l);
    }

   //  @Override
    static void greeting() {
        System.out.println("hey i'm in static boxweight");
    }


    public boxweight(double l, double h, double w, double weight) {
       // System.out.println("child class constructor");
        //calling the parent class constructor
        //used to initialize values present in parent class
        super(l,h,w);
        this.weight = weight;
        //the below 'super' will give error because the parent class
        //doesn't care about the child class.
        //super(l, h, w);
    }
}
