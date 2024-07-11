/**
 * Metodo main del juego.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya;

import com.alejandro.tres_en_raya.gui.CreditosFrame;
import com.alejandro.tres_en_raya.gui.GameFrame;

public class Main {
    public static void main(String[] args) {
        // SwingUtilities.invokeLater(() -> {
        // new GameFrame();
        // });
        GameFrame gameFrame = new GameFrame();
        CreditosFrame creditosFrame = new CreditosFrame();
    }
}