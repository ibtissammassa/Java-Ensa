package EntNaturel;

public class EntNat {
    private int n;

    public EntNat(int n) throws ErrorConst{
        if(n<0) throw new ErrorConst(n);
        this.n=n;
    }

    public int getN() {
        return n;
    }

    public static EntNat somme(EntNat n1,EntNat n2){
        return n1+n2 ; 
    }
    public static EntNat différence(EntNat n1,EntNat n2){
        return n1-n2;
    }
    public static EntNat produit(EntNat n1,EntNat n2){
        return n1*n2;
    }
}
