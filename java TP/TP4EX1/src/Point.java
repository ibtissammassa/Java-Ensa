public class Point {
    private double x,y;
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double Getx(){
        return this.x;
    }
    public double Gety(){
        return this.y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void affCoord(){
        System.out.println("Coordonnées: x= "+x+" y= "+y);
    }
}
