package EntNaturel;

public class ErrSom extends ErrOp{
    public ErrSom(int op1,int op2){
        super(op1,op2);
    }

    @Override
    public String getMessage() {
        return "Error: Somme de: " + getOp1() + " et " + getOp2() + "hors limite";
    }
}
