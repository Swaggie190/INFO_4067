package Factory_Pattern_Example2;

//fabrique concrete 2------------------

public class ProduitFactory2 extends ProduitFactory{

    protected ProduitA createProduitA(){
        return new ProduitA2();
    }
}