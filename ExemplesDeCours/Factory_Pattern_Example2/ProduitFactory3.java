package Factory_Pattern_Example2;

public class ProduitFactory3 extends ProduitFactory{

    protected ProduitA createProduitA(){
        return new ProduitA3();
    }
}