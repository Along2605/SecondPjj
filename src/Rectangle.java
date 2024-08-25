package iuh.fit.se;

/**
 * @description: This class represents a bank with many bank accounts
 * @author: Long, Nguyen Anh
 * @version: 1.0
 * @created: 8/25/2024
 */

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        } else {
            this.length = length;
            this.width = width;
        }
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + ", perimeter=" + getPerimeter() + ", area = " + getArea() + "]";
    }

    public void setLength(double newVal) {
        if (newVal < 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        } else {
            this.length = newVal;
        }
    }

    public void setWidth(double newVal) {
        if (newVal < 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        } else {
            this.width = newVal;
        }
    }
}

