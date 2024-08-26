package OOPs;

public class Human {
    int age;
    String name;
    int salary;
    static long population;

    static void help() {
        System.out.println("HELP!");
    }

    public Human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population += 1;
        Human.help();
    }
}
