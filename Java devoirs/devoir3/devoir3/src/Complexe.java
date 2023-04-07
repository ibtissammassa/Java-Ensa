public class Complexe {
    private double r;
    private double i;

    public Complexe(double r,double i){
        this.i=i;
        this.r=r;
    }
    public String toString(){
        if(r==0){
            return "+"+i+"*i";
        }else if(i<0){
            return r+" - "+(-i)+"*i";
        }else{
            return r+" + "+i+"*i";
        }
    }

    public boolean Equals(Complexe c){
        if(this.r==c.r && this.i==c.i){
            return true;
        }else return false;
    }

    public Complexe Somme(Complexe c){
        double r=this.r + c.r;
        double i=this.i + c.i;
        return new Complexe(r,i);
    }

    public Complexe Produit(Complexe c){
        double r = this.r*c.r - this.i*c.i;
        double i = this.r*c.i + this.i*c.r;
        return new Complexe(r,i);
    }

    public Complexe conjugué(){
        double r =this.r;
        double i= -this.i;
        return new Complexe(r,i);
    }

    public double module(){
        return Math.sqrt(Math.pow(this.r, 2)+Math.pow(this.i, 2));
    }

    public Complexe carré(){
        return this.Produit(this);
    }
}
