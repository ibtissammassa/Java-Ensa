public final class Point2DI {
    private final double x;
    private final double y;

    public Point2DI(){
        this.x=0;
        this.y=0;
    }
    public Point2DI(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getx(){
        return this.x;
    }
    public double gety(){
        return this.y;
    }
    public String toString(){
        return "("+this.getx()+","+this.gety()+")";
    }
    public double distance(Point2DI p){
        return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
    }
    public Point2DI translate (double a,double b){
        return new Point2DI(this.x+a,this.y+b);//new object car classe non modifiable
    }
    public static void main(String[] args) {
        Point2DI p0 = new Point2DI();
        Point2DI p1 = new Point2DI(1,1);
        Point2DI p2 = new Point2DI(1,2);

        System.out.println(p0.getx());
        System.out.println(p0.gety());
        System.out.println(p1.getx());
        System.out.println(p1.gety());

        System.out.println("Les coordonnes de p0: "+p0.toString());
        System.out.println("Les coordonnes de p1: "+p1.toString());
        System.out.println("Les coordonnes de p2: "+p2.toString());
        
        System.out.println("Distance entre "+p1.toString()+" et "+p2.toString()+" est "+p1.distance(p2));
        System.out.println("translation de "+p1.toString()+" et (2,3) est: "+p1.translate(2, 3));
    }
}
