package EntNaturel;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        boolean exception;
        Scanner clavier = new Scanner(System.in);
        do{
            exception = false;
            System.out.println("Entrer un nombre positif :");
            try {
                EntNat n = new EntNat(clavier.nextInt());
                System.out.println("votre entier est : "+ n.getN());
            } catch (ErrorConst e) {
                exception = true;
                System.out.println(e.getMessage() + e.getnAnormal());
            }
        }while(exception==true);
        clavier.close();
    }
}
