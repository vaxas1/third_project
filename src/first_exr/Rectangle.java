package first_exr;

public class Rectangle extends Shape{
    double width;
    double length;

    public Rectangle() {
        width = 5;
        length = 5;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.length = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.length = height;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", height=" + length + ", color=" + color + ", filled=" + filled + "]";
    }
}
