/**
 * PartidaFrame: Ventana que se usa para la partida.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya.gui;

import javax.swing.JFrame;

public class PartidaFrame extends GeneralFrame {

  //////// Atributos
  private static final String TITULO = "PARTIDA";

  //////// Contructor

  /**
   * Conctuctor de la clase CreditosFrame
   */
  public PartidaFrame() {
    
    super();

    // Estetica
    setTitle(TITULO);

    // Opciones
    // Oculta la ventana al cerrarla:
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
  }
}
