package EntNaturel;

public class ErrOp extends ErrNat{
    private int op1;
    private int op2;

    public ErrOp(int op1,int op2){
        this.op1=op1;
        this.op2=op2;
    }

    public int getOp1() {
        return op1;
    }

    public int getOp2() {
        return op2;
    }
}
