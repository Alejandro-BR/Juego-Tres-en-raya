/**
 * GameFrame: Ventana del juego.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya.gui;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

  private static final int ANCHO = 800;
  private static final int ALTURA = 600;

  public GameFrame() {
    setTitle("TRES EN RAYA");

    setSize(ANCHO, ALTURA);
    setVisible(true);

    setLocationRelativeTo(null); // Centra la ventana en la pantalla
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra el programa al cerra ventana
    setResizable(true); // Permite redimensionar la ventana
  }
}
