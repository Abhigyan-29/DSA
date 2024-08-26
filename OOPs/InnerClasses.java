package OOPs;


//Outside classes cannot be static
public class InnerClasses {
    //we can use test class if it is outside innerclass, as it does not depend on
    //innerclass.  but when it is inside the innerclass it need to be static.
    static class Test {
        static String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("kunal");
        Test b = new Test("Rahul");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
