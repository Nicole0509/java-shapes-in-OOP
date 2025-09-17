import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To Shapes In OOP!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a shape and find its area: ");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1: 
                System.out.print("Enter the radius of a circle in cm: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);

                System.out.printf("The area of the circle is %.2f cm²" , circle.calculateArea());
                break;
            case 2: 
                System.out.print("Enter the width of a rectangle in cm: ");
                double width = scanner.nextDouble();
                System.out.print("Enter the length of a rectangle in cm: ");
                double length = scanner.nextDouble();

                Rectangle rectangle = new Rectangle(width, length);
                System.out.printf("The area of the rectangle is %.2f cm²" , rectangle.calculateArea());
                break;
            case 3: 
                System.out.print("Enter the base of a triangle in cm: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of a triangle in cm: ");
                double height = scanner.nextDouble();

                Triangle triangle = new Triangle(base, height);
                System.out.printf("The area of the rectangle is %.2f cm²" , triangle.calculateArea());
                break;
            default: 
                System.out.println("Invalid choice");
        }

    }
}