package freezemonster;

import java.awt.EventQueue;

import spriteframework.AbstractBoard;
import spriteframework.MainFrame;
//Fernando Favaro Henriques Netto - 12311bcc006
//Tarik do Carmo Najm - 12311bcc046
public class FreezeMonsterGame extends MainFrame {


    public FreezeMonsterGame () {
        super("Freeze Monsters");
    }

    protected  AbstractBoard createBoard() {
        return new FreezeMonsterBoard();
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            new FreezeMonsterGame();
        });
    }

}