/**
 * CreditosFrame: Ventana de los creditos.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya.gui;

import javax.swing.JFrame;

public class CreditosFrame extends GeneralFrame {

  private static final String TITULO = "CREDITOS";

  public CreditosFrame() {
    // Estetica
    setTitle(TITULO);

    // Opciones
    // Oculta la ventana al cerrarla:
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
  }
}
