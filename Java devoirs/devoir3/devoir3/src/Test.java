public class Test {
    public static void main(String[] args) {
        Complexe c1 = new Complexe(1,2);
        Complexe c2 = new Complexe(2,3);
        Complexe c3 = new Complexe(3,4);
        Complexe c4 = new Complexe(1,2);

        System.out.println("c1= "+c1.toString());//1.0+2.0*i
        System.out.println("c2= "+c2.toString());//2.0+3.0*i
        System.out.println("c3= "+c3.toString());//3.0+4.0*i

        System.out.println("c1 equals c2 ? "+ c1.Equals(c2));//false
        System.out.println("c1 equals c4 ? "+ c1.Equals(c4));//true

        System.out.println("c1 + c2 = "+c1.Somme(c2));
        System.out.println("c1 * c2 = "+c1.Produit(c2));
        System.out.println("le conjugué de c3 est: "+c3.conjugué());
        System.out.println("le module de c1 est: "+c1.module());
        System.out.println("le carré de c2 est: "+c2.carré());


    }
}
