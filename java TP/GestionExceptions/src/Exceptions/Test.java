package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double a,b,res;
        Scanner clavier = new Scanner(System.in);
        boolean exception;
        do{
            exception=false;
            try {
                System.out.println("Entrer le premier opérande");
                a = clavier.nextDouble();
                System.out.println("Entrer le deuxieme opérande");
                b = clavier.nextDouble();
                res = Operations.division(a, b);
                System.out.println("le resultat de " + a +" divise par "+ b +" est "+ res);
                System.out.println("Fin du programme");
                } catch (InputMismatchException e) {
                    exception=true;
                    System.out.println("l'operande doit etre de type double !");
                    clavier.nextLine();
                }catch(ArithmeticException e){
                    exception=true;
                    System.out.println("On ne peut pas deviser par 0 !");
                }
        }while(exception==true);
        clavier.close();
    }
}
