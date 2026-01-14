package day10;

public class Employee {

    int employeeId = 0;
    String eName;
    String job;
    int sal;

    void display(){
        System.out.println(employeeId);
        System.out.println(eName);
        System.out.println(job);
        System.out.println(sal);
    }

    public static void main(String[] args){

        Employee emp1 = new Employee();
        emp1.employeeId = 101;
        emp1.eName = "John";
        emp1.job = "Manager";
        emp1.sal = 5000;
        emp1.display();


        Employee employee2 = new Employee();
        employee2.employeeId = 102;
        employee2.eName = "David";
        employee2.job = "engineer";
        employee2.sal = 60000;
        employee2.display();

    }
}
