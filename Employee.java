public class Employee {
    String name;
    int age;
    double salary;
    String location;
    static String companyName = "Object Computing, Inc."; // static variable

    Employee(String name, int age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary(double byPercent) {
        this.salary = this.salary + (this.salary * byPercent / 100);
    }

    void print() {
        System.out.println("\n\n");
        System.out.println("-------------------------------------Employee Details of " + this.name + " ---------------------------------\n");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
        System.out.println("Location: " + this.location);
        System.out.println("Company Name: " + Employee.companyName);
    }
}