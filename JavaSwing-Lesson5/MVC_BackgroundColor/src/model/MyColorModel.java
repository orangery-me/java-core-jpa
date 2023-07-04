package model;

import java.awt.Color;
// import java.awt.color.*;

public class ColorModel {
    private Color fore;
    private Color background;
    private boolean opaque;

    public ColorModel(){
        this.fore= Color.BLACK;
        this.background=Color.WHITE;
        this.opaque=true;
    }

    public Color getFore() {
        return fore;
    }

    public void setFore(Color fore) {
        this.fore = fore;
    }

    public Color getBackground() {
        return background;
    }

    public void setBackground(Color background) {
        this.background = background;
    }

    public boolean isOpaque() {
        return opaque;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }
    

}
