package Chapter_13_5;

class Rectangle extends GeometricObject implements Comparable<Rectangle>{
    private Double width;
    private Double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public Double area() {
        return this.width * this.height;
    }

    @Override
    public Double perimeter() {
        return (this.width + this.height) * 2;
    }

    @Override
    public String max(Rectangle obj1, Rectangle obj2) {
        return obj1.area() > obj2.area() ? "Rectangle with width of " + obj1.width + " and height of " + obj1.height + "\n" :
                "Rectangle with width of " + obj2.width + " and height of " + obj2.height + "\n";
    }

    public String toString() {
        return "Rectangle with width of " + this.width + " and height of " + this.height + "\n" +
                "Area of Rectangle: " + area() + "\n" +
                "Perimeter of Rectangle: " + perimeter()  + "\n";
    }
}
