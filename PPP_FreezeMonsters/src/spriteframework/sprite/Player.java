package spriteframework.sprite;

import javax.swing.ImageIcon;

import spriteframework.Commons;

import java.awt.Image;
import java.awt.event.KeyEvent;

public class Player extends Sprite {

    public Player() {
        loadImage();
        getImageDimensions();
        resetState();
    }

    protected void loadImage () {
        ImageIcon ii = new ImageIcon("C:\\UFU\\POO2\\TrabalhoFinal\\TrabalhoFinal\\images\\player.png");
        width = ii.getImage().getWidth(null);
        setImage(ii.getImage());
    }

    public void act() {

        x += dx;

        if (x <= 2) {

            x = 2;
        }

        if (x >= Commons.BOARD_WIDTH - 2 * width) {

            x = Commons.BOARD_WIDTH - 2 * width;
        }
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {

            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {

            dx = 2;
        }
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {

            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {

            dx = 0;
        }
    }
    protected void resetState() {

        setX(Commons.INIT_PLAYER_X);
        setY(Commons.INIT_PLAYER_Y);
    }
}
