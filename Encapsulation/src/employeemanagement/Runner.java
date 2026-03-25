package employeemanagement;

public class Runner {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(1, "Ashita", 50000);
        Employee emp2 = new PartTimeEmployee(2, "Rani", 0, 80, 200);

        ((Department) emp1).assignDepartment("HR");
        ((Department) emp2).assignDepartment("IT");

        Employee[] employees = {emp1, emp2};

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Salary: " + emp.calculateSalary());
            System.out.println(((Department) emp).getDepartmentDetails());
            System.out.println("----------------------");
        }
    }
}
