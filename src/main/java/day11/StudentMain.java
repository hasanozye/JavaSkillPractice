package day11;

public class StudentMain {

    public static void main(String[] args) {
        Student student = new Student(101,"John",'B');
        student.printStudentData();
//       1) Assign the data using object reference
        student.sId = 101;
        student.sName = "John";
        student.grade = 'A';
        student.printStudentData();

//        2) Assign the data by using user defined method
        student.setStudentData(101,"John",'B');
        student.printStudentData();

//        3) using constructor


    }
}
