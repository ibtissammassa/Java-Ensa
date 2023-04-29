package Dessiner;
import java.awt.Color;
import java.awt.Graphics;

import Forme.Cercle;

public class DessinerCercle  extends Cercle implements Dessiner{

    public DessinerCercle(double r, double x, double y) {
        super(r, x, y);
    }

    @Override
    public void afficher(Graphics s) {
        s.setColor(Color.red);
        s.drawOval((int)x, (int)y, (int)r*2, (int)r*2);
    }
}
