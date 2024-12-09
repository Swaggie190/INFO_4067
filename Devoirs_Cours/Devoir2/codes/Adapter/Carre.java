package codes.Adapter;

public class Carre implements iCarre {
    private double side;

    @Override
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double Perimeter() {
        return 4 * side;
    }

    @Override
    public double Area() {
        return side * side;
    }
}
