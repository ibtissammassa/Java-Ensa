public class Complexe extends Affichage implements IOperation{
    private double im;
    private double re;

    public Complexe(double re,double im){
        this.im=im;
        this.re=re;
    }

    @Override
    public Object plus(Object obj) {
        double re=((Complexe)obj).re+this.re;
        double im=((Complexe)obj).im+this.im;
        return new Complexe(re,im);
    }

    @Override
    public Object moins(Object obj) {
        double re=this.re-((Complexe)obj).re;
        double im=this.im-((Complexe)obj).im;
        return new Complexe(re,im);
    }

    @Override
    public String affiche() {
        return "Re= "+this.re+" Im= "+this.im;
    }
}
