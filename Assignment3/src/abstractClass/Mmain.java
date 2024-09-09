package abstractClass;
import java.util.Scanner;

public class Mmain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for a FullTimeEmployee
        System.out.println("Enter Full-Time Employee details:");
        System.out.print("Name: ");
        String ftName = scanner.nextLine();
        System.out.print("ID: ");
        int ftId = scanner.nextInt();
        System.out.print("Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        Employee ftEmployee = new FullTimeEmployee(ftName, ftId, basicSalary);
        ftEmployee.displayDetails();
        System.out.println("Calculated Salary: " + ftEmployee.calculateSalary());

        // Taking input for a PartTimeEmployee
        System.out.println("\nEnter Part-Time Employee details:");
        scanner.nextLine(); // Consume leftover newline
        System.out.print("Name: ");
        String ptName = scanner.nextLine();
        System.out.print("ID: ");
        int ptId = scanner.nextInt();
        System.out.print("Hourly Rate: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Hours Worked: ");
        int hoursWorked = scanner.nextInt();

        Employee ptEmployee = new PartTimeEmployee(ptName, ptId, hourlyRate, hoursWorked);
        ptEmployee.displayDetails();
        System.out.println("Calculated Salary: " + ptEmployee.calculateSalary());

        System.out.println("\nChoose a role to perform duties:");
        System.out.println("1. Manager");
        System.out.println("2. Developer");
        int choice = scanner.nextInt();

        Workable role;
        switch (choice) {
            case 1:
                role = new Manager();
                break;
            case 2:
                role = new Developer();
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                scanner.close();
                return;
        }

        role.performDuties();
        scanner.close();
    }
}
