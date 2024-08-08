/**
 * CreditosFrame: Ventana de los creditos.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya.gui;

import javax.swing.JFrame;

public class CreditosFrame extends GeneralFrame {

  //////// Atributos
  private static final String TITULO = "CREDITOS";

  //////// Contructor

  /**
   * Conctuctor de la clase CreditosFrame
   */
  public CreditosFrame() {

    super();
    // Estetica
    setTitle(TITULO);
    // Opciones
    // Oculta la ventana al cerrarla:
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    // Panel
    CreditosPanel creditosPanel = new CreditosPanel();
    add(creditosPanel);
  }

}
