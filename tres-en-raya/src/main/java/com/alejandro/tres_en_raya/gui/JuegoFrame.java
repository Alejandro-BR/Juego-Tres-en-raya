/**
 * GameFrame: Ventana principal del juego.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya.gui;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
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
    setIconImage(getImage());
    // Forma y posicion
    setExtendedState(Frame.MAXIMIZED_BOTH); // Pantalla completa
    // Opciones
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra el programa al cerrar ventana
  }

  //////// Metodos

  /**
   * Obtener la imagen para el icono.
   * 
   * @return Image
   */
  private Image getImage() {
    String imgPath = "/img/logo.jpg";
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource(imgPath));

    if (image == null) {
      System.err.println("No se pudo cargar el icono desde: " + imgPath);
    }

    return image;
  }
}
