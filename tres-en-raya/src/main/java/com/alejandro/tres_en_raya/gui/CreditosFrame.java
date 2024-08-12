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

  //////// Constructor

  /**
   * Constructor de la clase CreditosFrame
   */
  public CreditosFrame() {
    super();
    // Estética
    setTitle(TITULO);
    // Opciones
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // Oculta la ventana al cerrarla
    // Panel
    CreditosPanel creditosPanel = new CreditosPanel();
    add(creditosPanel);
  }
}