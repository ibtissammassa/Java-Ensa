package Forme;

public abstract class Forme {
    protected double x , y;

    public void deplace(double x,double y){
        this.x += x;
        this.y += y;
    }

    public Forme(double x,double y){
        this.x=x;
        this.y=y;
    }

    public abstract double surface();
    public abstract double périmètre();

}
