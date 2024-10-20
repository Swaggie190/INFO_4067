package Singleton_TP;

public final class operation_mathematique {
    private static operation_mathematique instance = null;
    private int x;
    private int y;
    private int z;
    
    //A constructor that does nothing
    private operation_mathematique(){
        super();
    }

    //Constructor with 2 parameters
    private operation_mathematique(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    //Constructor with 3 parameters
    private operation_mathematique(int x, int y, int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public static operation_mathematique getInstance(){
        if (instance == null){
            instance = new operation_mathematique();
        }

    return instance;
    }

    public static operation_mathematique getInstance(int x, int y){
        if (instance == null){
            instance = new operation_mathematique(x, y);
        }
        return instance;
    }

    public static operation_mathematique getInstance(int x, int y, int z){
        if (instance == null){
            instance = new operation_mathematique(x, y, z);
        }
        return instance;
    }

    //Sum with 2 parameters
    public int somme(int x, int y){
        return x+y;
    }

    //Sum with 3 parameters
    public int somme(int x, int y, int z){
        return x+y+z;
    }
    
    public void affiche(){
        System.out.println("\nJe suis une instance mes valeurs sont : x = " + this.x + " et y = " + this.y + " et z = " + this.y);
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
