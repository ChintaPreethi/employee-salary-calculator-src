public class Employee {

    private int employeeId;
    private String employeeName;
    private double basicSalary;

    public Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public double calculateHRA() {
        return basicSalary * 0.20;
    }

    public double calculateDA() {
        return basicSalary * 0.10;
    }

    public double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    public double calculateTax() {

        double grossSalary = calculateGrossSalary();

        if (grossSalary > 50000) {
            return grossSalary * 0.10;
        } else if (grossSalary > 30000) {
            return grossSalary * 0.05;
        }

        return 0;
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculateTax();
    }

    public void displaySalarySlip() {

        System.out.println("\n=================================");
        System.out.println("          SALARY SLIP");
        System.out.println("=================================");

        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);

        System.out.println("---------------------------------");

        System.out.printf(
                "Basic Salary  : ₹%.2f%n",
                basicSalary
        );

        System.out.printf(
                "HRA (20%%)     : ₹%.2f%n",
                calculateHRA()
        );

        System.out.printf(
                "DA (10%%)      : ₹%.2f%n",
                calculateDA()
        );

        System.out.printf(
                "Gross Salary  : ₹%.2f%n",
                calculateGrossSalary()
        );

        System.out.printf(
                "Tax           : ₹%.2f%n",
                calculateTax()
        );

        System.out.println("---------------------------------");

        System.out.printf(
                "Net Salary    : ₹%.2f%n",
                calculateNetSalary()
        );

        System.out.println("=================================");
    }
}