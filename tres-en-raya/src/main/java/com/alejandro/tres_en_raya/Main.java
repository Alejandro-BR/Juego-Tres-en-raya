/**
 * Metodo main del juego.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya;

import javax.swing.JFrame;

// import javax.swing.SwingUtilities;

import com.alejandro.tres_en_raya.gui.GameFrame;

public class Main {
    public static void main(String[] args) {
        // SwingUtilities.invokeLater(() -> {
            // new GameFrame();
            GameFrame gameFrame = new GameFrame();
            gameFrame.setVisible(true);

            // Si se cierra la ventana se cierra el programa:
            gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        // });

    }
}