package Chapter_13_5;

class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(6.0);

        Rectangle rectangle1 = new Rectangle(10.0, 5.0);
        Rectangle rectangle2 = new Rectangle(12.0, 4.0);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println("Larger Circle is the" + circle1.max(circle1, circle2));

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println("Larger Rectangle is the" + rectangle1.max(rectangle1, rectangle2));
    }
}
