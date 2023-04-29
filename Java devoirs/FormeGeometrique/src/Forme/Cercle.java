package Forme;

public class Cercle extends Forme {
    protected double r;

    public Cercle(double r,double x,double y){
        super(x, y);
        this.r=r;
    }

    @Override
    public double surface() {
        return Math.pow(r,2)*Math.PI;
    }

    @Override
    public double périmètre() {
        return 2*Math.PI*r;
    }
}
