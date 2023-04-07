public class Point3D extends Point {
    private double z;
    public Point3D(double x,double y,double z){
        super(x,y);
        this.z=z;
    }
    public void setZ(double z) {
        this.z = z;
    }
    public double Getz(){
        return this.z;
    }
    public void affCoord(){
        System.out.println("Coordonnées: x= "+Getx()+" y= "+Gety()+" z= "+Getz());
    }
}
