package OOPs;

public class main3 {
    public static void main(String[] args) {
        box box1 = new box(4, 3, 2);
//        System.out.println(box.l+ "  "+box.h+" " +box.w);
////box can't access boxweight's properties
        //but boxweight can access box's properties
        // box box5 = new boxweight(2,3,5,4);
        //here we can access, w,l,h but not weight because the accessibility
        //depends on the type of the refrence variable and not the object.
        //means it depends on "box box5" not on boxweight

        // System.out.println(box5.w);


        // you are given access to variables that are in the ref type i.e. BoxWeight

        // boxweight box6 = new box (2, 3, 4);
        //we can do boz1.greeting, but it's better to do box.greeting(classname)
//        box1.greeting();
//        box.greeting();
        box box = new boxweight();
        box.greeting();

    }
}
