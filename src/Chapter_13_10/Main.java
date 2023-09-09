package Chapter_13_10;

class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10.0, 5.0);
        Rectangle rectangle2 = new Rectangle(5.0, 10.0, "Red",true);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle1.equals(rectangle2));
    }
}
