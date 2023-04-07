
public class PointNom3D extends Point3D {
    private char nom;
    public PointNom3D(double x,double y,double z,char nom){
        super(x,y,z);
        this.nom=nom;
    }
    public void affCoord(){
        System.out.println("Nom: "+this.nom);
        super.affCoord();
    }
    public Point3D translate(double a,double b,double c){
        setX(a);
        setY(b);
        setZ(c);
        return this;
    }
}
