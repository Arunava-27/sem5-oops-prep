public class Main {
    public static void main(String[] args) {
        Analyst a = new Analyst("John", 100000, 30);
        Salesperson s = new Salesperson("Jane", 100000, 30, .20);
        System.out.println(a.getName() + " " + a.getSalary());
        System.out.println(s.getName() + " " + s.getSalary());
        a.raiseSalary();
        s.raiseSalary();
        System.out.println(a.getName() + " " + a.getSalary());
        System.out.println(s.getName() + " " + s.getSalary());
        System.out.println(a.getAnnualBonus());
        System.out.println(s.getCommissionPercentage());
        s.raiseCommission();
        System.out.println(s.getCommissionPercentage());
    }
}
