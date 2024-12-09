package codes.Composite;

public class Fichier implements repertoire {
    private String nom;
    private typeElement type;

    public Fichier (String nom, typeElement type){

        if (type != typeElement.TXT && type != typeElement.PDF) {
            throw new IllegalArgumentException("Un fichier doit être TXT ou PDF");
        }

        this.nom = nom;
        this.type = type;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public typeElement getType() {
        return type;
    }

    @Override
    public void decrire(){
        System.out.println("Fichier - Nom : " + nom + ", Type : " + type);
    }

    @Override
    public void ajouter(repertoire element) {
        throw new UnsupportedOperationException("Un fichier ne peut pas contenir d'éléments");
    }

    @Override
    public void supprimer(repertoire element) {
        throw new UnsupportedOperationException("Un fichier ne peut pas contenir d'éléments");
    }

    @Override
    public repertoire obtenir(int index) {
        throw new UnsupportedOperationException("Un fichier ne peut pas contenir d'éléments");
    }
}