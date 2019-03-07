package pers.han.game;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.Graphics;

/**
 * plane class
 * @author han
 */

public class plane extends gameObject{

    boolean left,right,up,down;
    boolean live = true;


    public plane(double x, double y, int width, int height, int speed, Image img) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.img = img;
    }

    public void addDirection(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                left = true;
                break;
            case KeyEvent.VK_UP:
                up = true;
                break;
            case KeyEvent.VK_RIGHT:
                right = true;
                break;
            case KeyEvent.VK_DOWN:
                down = true;
                break;
        }
    }
    public void minusDirection(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                left = false;
                break;
            case KeyEvent.VK_UP:
                up = false;
                break;
            case KeyEvent.VK_RIGHT:
                right = false;
                break;
            case KeyEvent.VK_DOWN:
                down = false;
                break;
        }
    }
    public void drawSelf(Graphics g) {
        if (live) {
            g.drawImage(img, (int) x, (int) y, null);

            if (up) {
                y -= speed;
            }
            if (right) {
                x += speed;
            }
            if (left) {
                x -= speed;
            }
            if (down) {
                y += speed;
            }
        }else
            g.setColor(Color.YELLOW);;
            g.drawString("GAME OVER",380,300);
    }
}
