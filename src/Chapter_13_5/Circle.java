package Chapter_13_5;

class Circle extends GeometricObject implements Comparable<Circle>{
    private Double radius;

    private static final double PI = Math.PI;
    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return PI * this.radius * this.radius;
    }

    @Override
    public Double perimeter() {
        return 2 * PI * this.radius;
    }

    @Override
    public String max(Circle obj1, Circle obj2) {
        return obj1.area() > obj2.area() ? "Circle with radius of " + obj1.radius + "\n" :
                "Circle with radius of " + obj2.radius + "\n";
    }

    @Override
    public String toString() {
        return "Circle with radius of " + this.radius + "\n" +
                "Area of Circle: " + area() + "\n" +
                "Perimeter of Circle: " + perimeter() + "\n";
    }
}
