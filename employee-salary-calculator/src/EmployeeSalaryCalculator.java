import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("     EMPLOYEE SALARY CALCULATOR");
        System.out.println("=================================");

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        double salary;

        while (true) {

            System.out.print("Enter basic salary: ₹");
            salary = sc.nextDouble();

            if (salary > 0) {
                break;
            }

            System.out.println(
                    "Salary must be greater than 0."
            );
        }

        Employee employee =
                new Employee(id, name, salary);

        employee.displaySalarySlip();

        sc.close();
    }
}