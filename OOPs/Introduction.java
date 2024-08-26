package OOPs;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Introduction {
    public static void main(String[] args) {
        //data of 5 students :{name , roll , marks}
        //to store a data which contains all these 3 in a single data structure , we use class.
        //a named group of properties and functions : class ;  Class start with capital letter

        //  Student[] students = new Student[5];
        Student kunal = new Student(6743, "kushwaha", 87);
        Student Rahul = new Student(90, "Singh", 87);
//        kunal.rno = 13;
//        kunal.name = "kunal kushwaha";
//        kunal.marks   = 98;
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(Rahul.marks);
//        kunal.changename("arpit");
//        kunal.greeting();
        //here as the constructor is not initialised
        //the default constructor will be called
        Student random = new Student(Rahul);
        System.out.println(random.name);
        Student random2 = new Student();
        System.out.println(random2.name);
        Student one = new Student();
        Student two = one;
        one.name = "abhigyan";
        System.out.println(one.name);
        System.out.println(two.name);
    }
}

//This is s template
//create a class
class Student {
    //for every single student
    int rno;
    String name;
    float marks;

    //this is a constructor
    //we need a way to add the values of the above properties
    //object by object
    //we need one word to access every object
//    void greeting() {
//        System.out.println("my name is " + this.name);
//    }

    //    void changename(String newname) {
//        name = newname;
//
//    }
//this student's data will be taken from other student
    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student() {
        //this is how you call a constructor from another constructor
        this(64, "defaultperson", 100);
    }

    Student(int roll, String naam, float points) {
        this.rno = roll;
        this.name = naam;
        this.marks = points;

    }
}

