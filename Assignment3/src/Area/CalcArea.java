package Area;
import java.util.Scanner;

public class CalcArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;
        boolean continueOperations = true;

        while (continueOperations) {
            System.out.println("Choose a shape to calculate the area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.print("Enter your choice (1/2/3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    shape = new Rectangle(length, width);
                    break;
                case 3:
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    shape = new Triangle(base, height);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            if (shape != null) {
                double area = shape.calculateArea();
                System.out.println("The area is: " + area);
            }

            System.out.print("Do you want to perform another operation? (y/n): ");
            String userResponse = scanner.next();
            if (!userResponse.equalsIgnoreCase("y")) {
                continueOperations = false;
            }
        }

        System.out.println("Thank you!");
        scanner.close();
    }
}