public class Reel extends Affichage implements IOperation{
    private double x;

    public Reel(double x){
        this.x=x;
    }

    @Override
    public Object plus(Object obj) {
        return new Reel(((Reel)obj).x+this.x);
    }

    @Override
    public Object moins(Object obj) {
        return new Reel(this.x-((Reel)obj).x);
    }

    @Override
    public String affiche() {
        return "x= "+this.x;
    }
}
