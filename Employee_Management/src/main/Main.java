package main;

import model.Employee;
import service.EmployeeManagement;

public class Main {

    public static void main(String[] args) {

        EmployeeManagement management = new EmployeeManagement(10);

        management.addEmployee(new Employee(101, "John", "Developer", 50000));

        management.addEmployee(new Employee(102, "Alice", "Tester", 45000));

        management.addEmployee(new Employee(103, "David", "Manager", 80000));

        System.out.println("\n===== Employee List =====");

        management.displayEmployees();

        System.out.println("\n===== Search Employee =====");

        Employee employee = management.searchEmployee(102);

        if (employee != null)

            System.out.println(employee);

        else

            System.out.println("Employee Not Found");

        System.out.println("\n===== Delete Employee =====");

        management.deleteEmployee(102);

        System.out.println("\n===== Employee List After Deletion =====");

        management.displayEmployees();

    }

}