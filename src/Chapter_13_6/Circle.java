package Chapter_13_6;

class Circle extends GeometricObject {
    private Double radius;

    private static final double PI = Math.PI;
    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public Double area() {
        return PI * this.radius * this.radius;
    }
}

