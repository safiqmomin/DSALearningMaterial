package OOPS;
import OOPS.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test("Safiq", 12, 42342);
        Test t2 = new Test("Peter", 23, 545454);
        //t2.population = 5;
        //Test.population = 5;
        System.out.println(t1.population);
        System.out.println(t2.population);

        Student safiq = new Student(1, "safiq", 99.87f);
        Student shezin = new Student(2, "shezin", 94f);
        Student momin = new Student(3, "momin", 32f);
        Student khali = new Student(4, "Khali");

        System.out.println(safiq.toString());
        System.out.println(khali.toString());
    }


}
