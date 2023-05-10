package EntNaturel;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        boolean exception;
        Scanner clavier = new Scanner(System.in);
        //do{
           
    
            try {
                EntNat entier1 = new EntNat(100);
                EntNat entier2 = new EntNat(Integer.MAX_VALUE + 10);
    
                EntNat somme = EntNat.somme(entier1, entier2);
            } catch (ErrSom e) {
                System.out.println("Error in sum operation: " + e.getMessage());
            } catch (ErrNat e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
       // }while(exception==true);
        clavier.close();
    }
}
