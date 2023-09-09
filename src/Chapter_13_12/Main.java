package Chapter_13_12;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        while (true) {
            try {
                System.out.print("How many objects do you want to create: ");
                N = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter number");
                scanner.nextLine();
            }
        }
        GeometricObject[] geometricObjects = new GeometricObject[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Class name: ");
            scanner.nextLine();
            String className = scanner.nextLine();
            while (!className.equalsIgnoreCase("rectangle") &&
                    !className.equalsIgnoreCase("circle")) {
                System.out.print("Please enter either Rectangle or Circle: ");
                className = scanner.nextLine();
            }
            boolean isCreated = false;
            if (className.equalsIgnoreCase("Rectangle")) {
                while (!isCreated) {
                    try {
                        System.out.print("Enter width: ");
                        double width = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double height = scanner.nextDouble();
                        geometricObjects[i] = new Rectangle(width, height);
                        isCreated = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter number");
                        scanner.nextLine();
                    }
                }
            } else {
                while (!isCreated) {
                    try {
                        System.out.print("Enter radius: ");
                        double radius = scanner.nextDouble();
                        geometricObjects[i] = new Circle(radius);
                        isCreated = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter number");
                        scanner.nextLine();
                    }
                }
            }
        }

        System.out.println("Sum of the areas of all objects: " + sumArea(geometricObjects));
    }
    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (GeometricObject obj: a) {
            sum += obj.area();
        }
        return sum;
    }
}
