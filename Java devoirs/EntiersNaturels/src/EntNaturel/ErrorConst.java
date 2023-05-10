package EntNaturel;

public class ErrorConst extends ErrNat{
    private int nAnormal;

    public ErrorConst(int n){
        nAnormal = n ;
    }

    public int getnAnormal() {
        return nAnormal;
    }

    @Override
    public String getMessage() {
        return nAnormal+" n'est pas positif !";
    }
}
