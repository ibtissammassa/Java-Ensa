package EntNaturel;

public class ErrProd extends ErrOp{

    public ErrProd(int op1, int op2) {
        super(op1, op2);
    }

    @Override
    public String getMessage() {
        return "Error: Produit de: " + getOp1() + " et " + getOp2() + "hors limite";
    }
    
}
