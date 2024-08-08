/**
 * GameFrame: Ventana principal del juego.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya.gui;

import java.awt.Frame;
import javax.swing.JFrame;

public class JuegoFrame extends GeneralFrame {

  //////// Atributos
  private static final String TITULO = "TRES EN RAYA";

  //////// Constructor

  /**
   * Constructor de la clase JuegoFrame.
   */
  public JuegoFrame() {
    super();
    // Estetica
    setTitle(TITULO);
    // Forma y posicion
    setExtendedState(Frame.MAXIMIZED_BOTH); // Pantalla completa
    // Opciones
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra el programa al cerrar ventana
    // Panel
    JuegoPanel juegoPanel = new JuegoPanel();
    add(juegoPanel);

  }
}
