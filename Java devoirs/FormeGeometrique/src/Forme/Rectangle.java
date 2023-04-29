package Forme;

public class Rectangle extends Forme{
    protected double l,L;

    public Rectangle(double x,double y,double l,double L){
        super(x, y);
        this.L=L;
        this.l=l;
    }
    @Override
    public double surface() {
        return l*L;
    }

    @Override
    public double périmètre() {
        return 2*(l+L);
    }
}
