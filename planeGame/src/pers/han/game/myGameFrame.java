package pers.han.game;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Image;


/**
 * planeGame
 * @author han
 */

public class myGameFrame extends Frame {

    Image bg = GameUtil.getImage("images/bg.jpg");
    Image planeImg = GameUtil.getImage("images/plane.png");

    plane p = new plane(400,600,10,15,10,planeImg);
    shell[] shells = new shell[50];

    @Override
    public void paint(Graphics g) {
        g.drawImage(bg,0,0,null);
        p.drawSelf(g);

        for (shell i: shells) {
            i.draw(g);
            boolean Con = i.getRect().intersects(p.getRect());

            if (Con) {
                p.live = false;
            }
        }
    }

    //repaint window
    public class paintThread extends Thread {
        @Override
        public void run() {
            while(true) {
                repaint();
                try {
                    Thread.sleep(17);
                }
                catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            p.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            p.minusDirection(e);
        }
    }

    /**
     * double buffer
     * better than JFrame
     */
    private Image offScreenImage = null;
    public void update(Graphics g) {
        if (offScreenImage == null)
            offScreenImage = this.createImage(constent.gameWidth,constent.gameHight);

        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage,0,0,null);
    }

    /**
     * initialize window
     */
    public void lauchFrame() {
        this.setTitle("hanProject");
        this.setVisible(true);
        this.setSize(constent.gameWidth,constent.gameHight);
        this.setLocation(300,100);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        for (int i = 0;i<shells.length;i++) {
            shells [i] = new shell();
        }

        new paintThread().start();
        addKeyListener(new KeyMonitor());

    }

    public static void main(String[] args) {
        myGameFrame frame = new myGameFrame();
        frame.lauchFrame();

    }
}
