package Chapter_13_6;

class Main {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(5.0);
        ComparableCircle circle2 = new ComparableCircle(4.0);

        System.out.println("Larger is the Circle with radius of " + circle1.compareTo(circle1, circle2));
    }
}
