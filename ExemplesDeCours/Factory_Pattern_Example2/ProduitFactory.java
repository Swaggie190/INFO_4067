package Factory_Pattern_Example2;


// fabrique abstraite ------------------
public abstract class ProduitFactory{

    protected abstract ProduitA createProduitA();
   
    public ProduitA getProduitA(){
        return createProduitA();
    }
}

