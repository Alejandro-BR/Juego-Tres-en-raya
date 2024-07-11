/**
 * GeneralFrame: Ventana que se usa de forma general.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya.gui;

import javax.swing.JFrame;

public class GeneralFrame extends JFrame {

  protected static final int ANCHO = 800;
  protected static final int ALTURA = 600;

  public GeneralFrame() {
    // Forma y posicion
    setSize(ANCHO, ALTURA); 
    setLocationRelativeTo(null); // Centra la ventana en la pantalla
    setVisible(true); // Es visible la ventana
    setResizable(true); // Permite redimensionar la ventana
  }
}
