package Chapter_13_9;

class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0, "Red", true);
        Circle circle2 = new Circle(5.0);
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1);
        System.out.println(circle2);
    }
}
