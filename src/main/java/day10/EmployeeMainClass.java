package day10;

public class EmployeeMainClass {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.employeeId = 101;
        employee.eName = "Kim";
        employee.job = "Programmer";
        employee.sal = 30000;
        employee.display();
    }
}
