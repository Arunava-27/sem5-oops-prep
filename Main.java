import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Employee[] employees;
        int numberOfEmployees;
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of employees: ");
            numberOfEmployees = scanner.nextInt();
            employees = new Employee[numberOfEmployees];
            for (int i = 0; i < numberOfEmployees; i++) {
                System.out.println("\n\n------------------------------Enter the details of employee " + (i + 1) + "---------------------------------\n");
                System.out.print("Enter the name of employee " + (i + 1) + ": ");
                String name = scanner.next();
                System.out.print("Enter the age of employee " + (i + 1) + ": ");
                int age = scanner.nextInt();
                System.out.print("Enter the salary of employee " + (i + 1) + ": ");
                double salary = scanner.nextDouble();
                System.out.print("Enter the location of employee " + (i + 1) + ": ");
                String location = scanner.next();
                employees[i] = new Employee(name, age, salary, location);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        for (Employee employee : employees) {
            employee.print();
        }

        employees[0].raiseSalary(10);


        System.out.println("\n\nAfter raiseSalary() method call\n\n");

        for (Employee employee : employees) {
            employee.print();
        }
    }
}
