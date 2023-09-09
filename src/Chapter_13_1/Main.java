package Chapter_13_1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter sides of triangle: ");
                Double side1 = scanner.nextDouble();
                Double side2 = scanner.nextDouble();
                Double side3 = scanner.nextDouble();

                System.out.print("Enter the color of triangle: ");
                String color = scanner.next();

                System.out.print("Is triangle filled: ");
                Boolean isFilled = scanner.nextBoolean();

                Triangle triangle = new Triangle(side1, side2, side3, color, isFilled);
                System.out.println(triangle);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter correct value");
                scanner.nextLine();
            }
        }
    }
}
