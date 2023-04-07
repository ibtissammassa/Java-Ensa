public class Main{
    public static void main(String[] args) {
        Complexe c1=new Complexe(2,1);
        Complexe c2=new Complexe(3,4);
        Reel r1=new Reel(5);
        Reel r2=new Reel(6);

        System.out.println(c1.affiche());
        System.out.println(c2.affiche());
        System.out.println(((Complexe)(c1.plus(c2))).affiche());
        System.out.println(((Complexe)(c2.moins(c1))).affiche());
        System.out.println(r1.affiche());
        System.out.println(r2.affiche());
        System.out.println(((Reel)(r1.plus(r2))).affiche());
        System.out.println(((Reel)(r2.moins(r1))).affiche());

        Affichage[] A = new Affichage[];
        A[0]=new Complexe();
    }
}