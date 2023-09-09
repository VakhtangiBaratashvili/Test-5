package Chapter_13_1;

class Triangle extends GeometricObject{
    private Double side1;
    private Double side2;
    private Double side3;
    private String color;
    private Boolean isFilled;

    private Double s;

    public Triangle(Double side1,
                    Double side2,
                    Double side3,
                    String color,
                    Boolean isFilled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
        this.isFilled = isFilled;
        s = perimeter()/2;
    }

    @Override
    public Double area() {
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public Double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String isFilled() {
        return this.isFilled ? "The Triangle is filled" : "The Triangle is not filled";
    }

    @Override
    public String toString() {
        return "Area: " + area() + "\n" +
                "Perimeter: " + perimeter() + "\n" +
                "Color: " + getColor() + "\n" +
                isFilled();
    }
}
