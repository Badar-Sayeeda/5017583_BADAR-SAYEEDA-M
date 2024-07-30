package employeemanage;

public class EmployeeManagementTest {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();

        Employee e1 = new Employee(1, "Alice", "Developer", 70000);
        Employee e2 = new Employee(2, "Bob", "Manager", 80000);

        management.addEmployee(e1);
        management.addEmployee(e2);

        System.out.println("All Employees:");
        management.traverseEmployees();

        System.out.println("Searching for employee with ID 1:");
        System.out.println(management.searchEmployee(1));

        management.deleteEmployee(1);
        System.out.println("All Employees after deletion:");
        management.traverseEmployees();
    }
}

