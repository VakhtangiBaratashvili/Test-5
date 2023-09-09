package Chapter_13_9;

class Circle extends GeometricObject implements Comparable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
        " and the radius is " + radius);
    }
    public int compareTo(Circle otherCircle) {
        if (this.radius < otherCircle.getRadius()) {
            return -1;
        } else if (this.radius > otherCircle.getRadius()) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Circle)) return false;
        Circle Circle = (Circle) obj;
        return Double.compare(Circle.radius, radius) == 0;
    }
}
