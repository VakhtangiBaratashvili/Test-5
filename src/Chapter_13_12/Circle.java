package Chapter_13_12;

class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
