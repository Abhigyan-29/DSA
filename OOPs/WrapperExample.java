package OOPs;

public class WrapperExample {
    public static void main(String[] args) {
       // int a = 10;

        //in the below example it is created as object
        //num is an object
        //this is known as wrapper class
       // Integer num = 45;
        Integer a = 10 ;
        Integer b =20;
        swap(a,b);
        System.out.println(b);
        System.out.println(a);
        //it's still not swapped
        //because integer has keyword named final
        //Final keyword : Value can't be changed
        final int bonus = 4;
        //bonus =7;
        //it gives error here,
        //because the value of bonus cant be changed as it has final keyword
        //Always final variables are initialized while declaring it
    }
    static void swap(Integer a , Integer b){
        int temp = a;
        a = b ;
        b = temp;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
}
