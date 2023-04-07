public class Main {
    public static void main(String[] args) {
        // PointNom3D p1 = new PointNom3D(1, 1, 1, 'A');
        // PointNom3D p2 = new PointNom3D(2, 2, 1, 'B');
        // Point3D p3 = new Point3D(1, 2, 3);
        // Point3D p4 = new Point3D(2, 3, 3);
        // Point p5 = new Point(1, 4);
        // Point p6 = new Point(2, 3);
        
        // p1.affCoord();
        // p2.affCoord();
        // p3.affCoord();
        // p4.affCoord();
        // p5.affCoord();
        // p6.affCoord();

//Pour optimiser le code:(Polymorphisme par sous typage)
        Point[] P = new Point[6];
        P[0]=new PointNom3D(1, 1, 1, 'A');
        P[1]=new PointNom3D(2, 2, 1, 'B');
        P[2]=new Point3D(1, 2, 3);
        P[3]=new Point3D(2, 3, 3);
        P[4]=new Point(1, 4);
        P[5]=new Point(2, 3);
        ((PointNom3D)P[0]).translate(2, 1, 3);
        ((PointNom3D)P[1]).translate(1, 2, 3);
        for(int i=0;i<P.length;i++){
            P[i].affCoord();
        }
    }  
}
