package Chapter_13_10;

class Rectangle extends GeometricObject implements Comparable{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public Rectangle(double width, double height,String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public void printRectangle() {
        System.out.println("The Rectangle is created " + getDateCreated() +
                " with the width of " + this.width + " and height of " + this.height);
    }
    public int compareTo(Rectangle otherRectangle) {
        if (this.getArea() < otherRectangle.getArea()) {
            return -1;
        } else if (this.getArea() > otherRectangle.getArea()) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.getArea(), getArea()) == 0;
    }
}
