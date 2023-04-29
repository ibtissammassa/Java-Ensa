package EntNaturel;

public class ErrorConst extends Exception{
    private int nAnormal;

    public ErrorConst(int n){
        super("LE NOMBRE DOIT ETRE POSITIF ");
        nAnormal = n ;
    }

    public int getnAnormal() {
        return nAnormal;
    }
}
