/**
 * Metodo main del juego.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya;

import com.alejandro.tres_en_raya.gui.CreditosFrame;
import com.alejandro.tres_en_raya.gui.JuegoFrame;
import com.alejandro.tres_en_raya.gui.PartidaFrame;

public class Main {
    public static void main(String[] args) {
        // SwingUtilities.invokeLater(() -> {
        // new GameFrame();
        // });
        JuegoFrame juegoFrame = new JuegoFrame();
        CreditosFrame creditosFrame = new CreditosFrame();
        PartidaFrame partidaFrame = new PartidaFrame();
    }
}