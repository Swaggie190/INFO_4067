package codes.Adapter;

public class Main {
    public static void main(String[] args) {
        // Création d'un adaptateur de carré basé sur un rectangle
        Rectangle rectangle = new Rectangle();
        iCarre carre = new AdapterCarre(rectangle);

        // Utilisation comme un carré
        carre.setSide(5);
        System.out.println("Périmètre : " + carre.Perimeter());
        System.out.println("Aire : " + carre.Area());
    }
}
