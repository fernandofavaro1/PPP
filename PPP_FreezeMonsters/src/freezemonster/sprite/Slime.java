package freezemonster.sprite;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.util.Random;

import spriteframework.sprite.BadSprite;

public class Slime extends BadSprite {

    private boolean destroyed;

    public Slime(int x, int y, int rand) {

        initSlime(x, y, rand);
    }

    private void initSlime(int x, int y, int rand) {
        setDestroyed(true);

        this.x = x;
        this.y = y;

        String gosmaImg = "C:/Aulas/PPP/PPP_FreezeMonsters/images/gosma.png";
        ImageIcon ii = new ImageIcon(gosmaImg);

        // Redimensiona a imagem para 30x30
        Image gosmaImage = ii.getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT);
        setImage(gosmaImage);
        this.dx = rand;
    }

    public void setDestroyed(boolean destroyed) {

        this.destroyed = destroyed;
    }

    public boolean isDestroyed() {
        return destroyed;
    }


}
