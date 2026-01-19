package day11;

public class Student {

    int sId;
    String sName;
    char grade;

    void printStudentData() {
        System.out.println(sId + " " + sName + " " + grade);
    }

    void setStudentData(int sId, String sName, char grade) {
        this.sId = sId;
        this.sName = sName;
        this.grade = grade;
    }

    Student(int sId, String sName, char grade) {
        this.sId = sId;
        this.sName = sName;
        this.grade = grade;
    }

}
