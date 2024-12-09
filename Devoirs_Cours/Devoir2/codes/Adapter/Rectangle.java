package codes.Adapter;

public class Rectangle {
    private double length;
    private double width;

    public void setParams(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double Perimeter() {
        return 2 * (length + width);
    }

    public double Area() {
        return length * width;
    }
} 
