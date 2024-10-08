package OOPs;
//this is a demo to show initialization of static variable
public class StaticBlock {
    static int a = 4;
    static int b;
    //will only run once , when the first obj is created
    static{
        System.out.println("i'm in static block");
        b = a* 5 ;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
