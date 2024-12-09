package codes.Composite;

public class Client {
    public static void main(String[] args) {

        dossier racine = new dossier("Racine");
        
        dossier documents = new dossier("Documents");
        Fichier rapport = new Fichier("rapport", typeElement.TXT);
        Fichier cv = new Fichier("cv", typeElement.PDF);
        documents.ajouter(rapport);
        documents.ajouter(cv);
        
        dossier images = new dossier("Images");
        Fichier photo1 = new Fichier("photo1", typeElement.PDF);
        images.ajouter(photo1);
        
        racine.ajouter(documents);
        racine.ajouter(images);
        
        // Démonstration des fonctionnalités
        System.out.println("Structure complète :");
        racine.decrire();
        
        // Obtenir un élément
        System.out.println("\nObtention du 1er élément du dossier racine :");
        racine.obtenir(0).decrire();
        
        // Suppression d'un élément
        documents.supprimer(cv);
        System.out.println("\nAprès suppression :");
        racine.decrire();
    }
}
