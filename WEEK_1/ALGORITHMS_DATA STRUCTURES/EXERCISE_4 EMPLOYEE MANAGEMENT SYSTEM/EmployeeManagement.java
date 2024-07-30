package employeemanage;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        if (employee != null) {
            employees.add(employee);
        }
    }

    public Employee searchEmployee(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void deleteEmployee(int employeeId) {
        Employee employeeToRemove = searchEmployee(employeeId);
        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
        } else {
            System.out.println("Employee not found!");
        }
    }
}

