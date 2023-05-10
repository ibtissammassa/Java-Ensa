package EntNaturel;

public class ErrNat extends Exception{
    @Override
    public String getMessage() {
        return "Nombre pas entier";
    }
}
