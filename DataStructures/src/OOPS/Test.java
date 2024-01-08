package OOPS;

public class Test {
    String name;
    int age;
    int salary;
    static long population;

    public Test(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        Test.population += 1;
    }

}
