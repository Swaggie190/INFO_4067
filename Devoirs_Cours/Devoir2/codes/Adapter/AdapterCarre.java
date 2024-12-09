package codes.Adapter;

public class AdapterCarre implements iCarre {

    private Rectangle rectangle;

    public AdapterCarre(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void setSide(double side) {
        // Définit un rectangle avec longueur = largeur = cote
        rectangle.setParams (side, side);
    }

    @Override
    public double Perimeter() {
        // Délègue au rectangle
        return rectangle.Perimeter();
    }

    @Override
    public double Area() {
        // Délègue au rectangle
        return rectangle.Area();
    }
} 
