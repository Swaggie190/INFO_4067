package codes.Composite;
import java.util.ArrayList;
import java.util.List;

public class dossier implements repertoire {
    private String nom;
    private typeElement type;
    private List<repertoire> repertoires;

    public dossier(String nom) {
        this.nom = nom;
        this.type = typeElement.DOSSIER;
        this.repertoires = new ArrayList<>();
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public typeElement getType() {
        return typeElement.DOSSIER;
    }

    @Override
    public void decrire() {
        System.out.println("Dossier - Nom : " + nom + "Type :" + type);
        for (repertoire repertoire : repertoires) {
            repertoire.decrire();
        }
    }

    @Override
    public void ajouter(repertoire repertoire) {
        repertoires.add(repertoire);
    }

    @Override
    public void supprimer(repertoire repertoire) {
        repertoires.remove(repertoire);
    }

    @Override
    public repertoire obtenir(int index) {
        if (index < 0 || index >= repertoires.size()) {
            throw new IndexOutOfBoundsException("Index invalide");
        }
        return repertoires.get(index);
    }
}