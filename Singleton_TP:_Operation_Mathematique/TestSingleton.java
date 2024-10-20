package Singleton_TP;

public class TestSingleton {
    public static void main(String[] args){
        int som = operation_mathematique.getInstance().somme(2, 5);
        System.out.printf("la somme est %d",som);

        int sum = operation_mathematique.getInstance().somme(2, 5, 7);
        System.out.printf("la deuxieme somme est %d",sum);

        operation_mathematique s1 = operation_mathematique.getInstance(8, 3);
        s1.affiche();
        
        operation_mathematique s2 = operation_mathematique.getInstance(5, 9, 3);
        s2.affiche();
    }
}
