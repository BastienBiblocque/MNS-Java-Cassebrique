package model.cassebrique;

import java.awt.*;

public class Balle extends Sprite implements Dessinable{


    private int vitesseVertical;
    private int vitesseHorizontal;


    public Balle(int x, int y,int largeur, int vitesseVertical, int vitesseHorizontal, Color couleur) {
        super(x,y,largeur, couleur);
        this.vitesseVertical = vitesseVertical;
        this.vitesseHorizontal = vitesseHorizontal;
    }

    public Balle(int x, int y,int largeur, int vitesseVertical, int vitesseHorizontal) {
        super(x, y,largeur, Color.RED);
        this.vitesseVertical = vitesseVertical;
        this.vitesseHorizontal = vitesseHorizontal;
    }

    public void mouvement(int largeur, int hauteur) {
        this.setX(this.getX() + vitesseHorizontal);
        this.setY(this.getY() + vitesseVertical);

        if(getX() > largeur || getX() < 0) {
            vitesseHorizontal *= -1;
        }
        if(getY() > hauteur || getY() < 0) {
            vitesseVertical *= -1;
        }
    }
    @Override
    public void dessinner(Graphics2D dessin){
        dessin.setColor(getCouleur());
        dessin.fillOval(this.getX(), this.getY(), this.getLargeur(), this.getLargeur());
    }


    public int getVitesseVertical() {
        return vitesseVertical;
    }

    public void setVitesseVertical(int vitesseVertical) {
        this.vitesseVertical = vitesseVertical;
    }

    public int getVitesseHorizontal() {
        return vitesseHorizontal;
    }

    public void setVitesseHorizontal(int vitesseHorizontal) {
        this.vitesseHorizontal = vitesseHorizontal;
    }
}
