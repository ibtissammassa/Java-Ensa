//EXERCICE 1 TP3
public class Objet {
    public static int num=0;
    public Objet(){
        num++;
        System.out.println("Creation d'un nouve objet N:"+num);
    }
    public static void main(String[] args) {
        Objet obj1 = new Objet();
        Objet obj2 = new Objet();
        Objet obj3 = new Objet();
        
    }
}
