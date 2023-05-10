package EntNaturel;

public class EntNat {
    private int n;

    public EntNat(int n) throws ErrorConst{
        if(n<0){throw new ErrorConst(n);}
        this.n=n;
    }

    public int getN() {
        return n;
    }

    public static EntNat somme(EntNat n1,EntNat n2) throws ErrorConst,ErrSom{
        int op1 = n1.n;
        int op2 = n2.n;
        int s = op1+op2;
        if(s>Integer.MAX_VALUE)throw new ErrSom(op1,op2);
        return new EntNat(s); 
    }
    public static EntNat différence(EntNat n1,EntNat n2) throws ErrorConst,ErrDif{
        int op1 = n1.n;
        int op2 = n2.n;
        int d = op1-op2;
        if(d>Integer.MAX_VALUE)throw new ErrDif(op1,op2);
        return new EntNat(d); 
    }
    public static EntNat produit(EntNat n1,EntNat n2) throws ErrorConst,ErrProd{
        int op1 = n1.n;
        int op2 = n2.n;
        int p = op1*op2;
        if(p>Integer.MAX_VALUE)throw new ErrProd(op1,op2);
        return new EntNat(p);
    }
}
