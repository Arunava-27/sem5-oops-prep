public class Analyst extends Employee {

    public Analyst(String name, double salary, int age) {
        super(name, salary, age);
    }

    public double getAnnualBonus() {
        return 0.10 * super.salary * .05;
    }

}
