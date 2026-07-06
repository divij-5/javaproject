class Employee {
    String name;
    int empId;
    double basicSalary;

    Employee(String name, int empId, double basicSalary) {
        this.name = name;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    void displayEmployee() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary : " + basicSalary);
    }
}
public class  main{
    public static void main(String[] args) {
        Employee emp = new Employee("divi", 101, 30000);

        System.out.println("divi avrage salary 30000");
        emp.displayEmployee();
    }
}    
