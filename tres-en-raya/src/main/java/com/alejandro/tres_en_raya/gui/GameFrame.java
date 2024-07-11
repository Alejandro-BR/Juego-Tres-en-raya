/**
 * GameFrame: Ventana del juego.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya.gui;

import java.awt.Frame;
import javax.swing.JFrame;

public class GameFrame extends GeneralFrame {

  private static final String TITULO = "TRES EN RAYA";

  public GameFrame() {

    // Estetica
    setTitle(TITULO);
    // setIconImage(getIconImage());

    // Forma y posicion
    setExtendedState(Frame.MAXIMIZED_BOTH); // Pantalla completa
    
    // Opciones
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra el programa al cerra ventana

  }
}
