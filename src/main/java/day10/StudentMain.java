package day10;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.sId = 1010;
        student.sName = "Krishna";
        student.grad = 'A';
        student.printStudentData();

        new Student();
        new Student().sId = 102;
        new Student().sName = "John";
        new Student().grad = 'B';
        new Student().printStudentData();



    }
}
