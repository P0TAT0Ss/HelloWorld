package pers.han.game;

import java.awt.*;

/**
 * gameObject
 * @author han
 */

class gameObject {
    Image img;
    double x,y;
    int speed;
    int width,height;

    public gameObject(double x,double y,int width,int height,int speed,Image img) {
        this.img = img;
        this.height = height;
        this.speed = speed;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public gameObject(double x,double y,Image img) {
        this.x = x;
        this.y = y;
        this.img = img;
    }

    public gameObject() {}

    public Rectangle getRect() {
        return new Rectangle((int)x,(int)y,width,height);
    }

    public void drawSelf(Graphics g) {
        g.drawImage(img,(int)x,(int)y,null);
    }
}
