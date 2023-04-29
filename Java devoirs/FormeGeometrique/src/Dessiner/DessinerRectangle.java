package Dessiner;
import java.awt.Color;
import java.awt.Graphics;

import Forme.Rectangle;

public class DessinerRectangle extends Rectangle implements Dessiner{

    public DessinerRectangle(double x, double y, double l, double L) {
        super(x, y, l, L);
    }

    @Override
    public void afficher(Graphics s) {
        s.setColor(Color.blue);
       s.drawRect((int)x, (int)y, (int)l, (int)L);
    }
    
}
