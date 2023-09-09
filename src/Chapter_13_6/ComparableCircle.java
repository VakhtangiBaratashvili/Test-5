package Chapter_13_6;

class ComparableCircle extends Circle implements Comparable{
    public ComparableCircle(Double radius) {
        super(radius);
    }

    @Override
    public Double compareTo(Circle obj1, Circle obj2) {
        return obj1.area() > obj2.area() ? obj1.getRadius() : obj2.getRadius();
    }
}
