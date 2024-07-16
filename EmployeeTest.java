
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Arjun", "Ram", 80000);
        Employee employee2 = new Employee("Ajay", "Ram", 88000);

        System.out.println("Employee1 Salary: " + employee1.getSalary());
        System.out.println("Employee2 Salary: " + employee2.getSalary());

        employee1.giveRaise(10);
        employee2.giveRaise(10);

        System.out.println("\nAfter 10% raise:");
        System.out.println("Employee1 Salary: " + employee1.getSalary());
        System.out.println("Employee2 Salary: " + employee2.getSalary());
    }
}
class Employee {
    private String firstname;
    private String lastname;
    private double salary;

    public Employee(String firstname, String lastname, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
        }
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
        }
    }
}

