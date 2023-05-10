package EntNaturel;

public class ErrDif extends ErrOp{

    public ErrDif(int op1, int op2) {
        super(op1, op2);
    }
    
    @Override
    public String getMessage() {
        return "Error: Difference de: " + getOp1() + " et " + getOp2() + "hors limite";
    }
}
