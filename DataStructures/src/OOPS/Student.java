package OOPS;

public class Student {
    int rno;
    String name;
    float marks;

    public Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    public Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    @Override
    public String toString(){
        return rno + name + marks;
    }
}
