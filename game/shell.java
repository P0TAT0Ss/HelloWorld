package pers.han.game;

import java.awt.*;

/**
 * shell class
 * @author han
 */

public class shell extends gameObject{
    double degree;
    public shell() {
        x =Math.random()*constent.gameWidth;
        y = 30;
        width = 10;
        height = 10;
        speed = 10;
        degree = Math.random()*Math.PI*2;
    }

    public void draw(Graphics g) {
        Color c = g.getColor();
        g.setColor(c.YELLOW);

        g.fillOval((int)x,(int)y,width,height);

        x += speed*Math.cos(degree);
        y += speed*Math.sin(degree);

        if (x<width || x>constent.gameWidth-width) {
            degree = Math.PI - degree;
        }
        if (y<30||y>constent.gameHight-height) {
            degree = -degree;
        }

        g.setColor(c);
    }
}
