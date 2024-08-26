package OOPs;

public class main {
    public static void main(String[] args) {
//        Human  kunal = new Human(12,"abhi" , 768876);
//        Human  Rahul = new Human(12,"rahul" , 763436);
//        Human  Arpit = new Human(12,"rahul" , 763436);
//        System.out.println(kunal.name);
//        //without using object of the class we can access these variables
//        //Static variables are not dependent on objects
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//       greeting() ;
    }
    static void message(){
        System.out.println("hello world");
    }
    void fun2(){
        greeting();
    }
    static void fun () {
        main obj = new main();
        obj.greeting();
    }
    void greeting() {
        fun();
        System.out.println("Hello World");
        main.message();
    }
}
