package Chapter_13_7;

class Square extends GeometricObject implements Colorable{
    private Double side;

    public Square(Double side) {
        this.side = side;
    }

    @Override
    public Double area() {
        return this.side * this.side;
    }

    @Override
    public Double perimeter() {
        return this.side * 4;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "Square with the side of " + this.side + "\n" +
                "Area: " + area() + "\n" +
                "Perimeter: " + perimeter() + "\n";
    }
}
