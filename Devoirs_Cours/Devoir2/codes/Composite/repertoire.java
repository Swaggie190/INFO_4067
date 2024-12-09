package codes.Composite;

public interface repertoire {
    String getNom();
    typeElement getType();
    void decrire();
    void ajouter(repertoire element);
    void supprimer(repertoire element);
    repertoire obtenir(int index);
}