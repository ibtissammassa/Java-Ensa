package Dessiner;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
		
		JCanvas jc = new JCanvas();
		jc.setBackground(Color.WHITE);
		jc.setPreferredSize(new Dimension(500, 500));
		
		DessinerCercle c1= new DessinerCercle(50, 100, 130);
		DessinerCercle c2= new DessinerCercle(100, 200, 200);
		DessinerRectangle r1= new DessinerRectangle(50, 50, 100, 80);
		DessinerRectangle r2= new DessinerRectangle(200, 150, 150, 100);

		c1.deplace(1, 1);
		c2.deplace(3, -50);
		r1.deplace(30, 100);
		r2.deplace(100, 0);

		jc.addDrawable(r1);
		jc.addDrawable(c1);
		jc.addDrawable(r2);
		jc.addDrawable(c2);

	    GUIHelper.showOnFrame(jc,"Dessin");

		jc.clear();
		GUIHelper.showOnFrame(jc,"Dessin");
}
}