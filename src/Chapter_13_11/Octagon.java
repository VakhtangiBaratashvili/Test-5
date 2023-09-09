package Chapter_13_11;

class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable<Octagon>{
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double perimeter() {
        return side * 8;
    }

    @Override
    public int compareTo(Octagon o) {
        return Double.compare(this.area(), o.area());
    }

    @Override
    public Octagon clone() {
        try {
            return (Octagon) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
