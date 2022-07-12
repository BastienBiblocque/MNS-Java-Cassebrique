package model.cassebrique;

import java.awt.*;

public class Rectangle extends Sprite implements Dessinable {
    private int hauteur;



    @Override
    public void dessinner(Graphics2D dessin){
        dessin.setColor(Color.RED);
        dessin.fillRect(getX(), getY(), this.getHauteur(), this.getLargeur());
    }

    public Rectangle(int x, int y, int hauteur,Color couleur) {
        super(x, y, couleur);
        this.hauteur = hauteur;
    }

    public Rectangle(int x, int y, int hauteur, int largeur) {
        super(x, y, largeur, Color.RED);
        this.hauteur = hauteur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
}
