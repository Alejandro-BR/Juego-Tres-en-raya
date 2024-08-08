/**
 * GeneralFrame: Ventana que se usa de forma general.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.awt.Image;

public class GeneralFrame extends JFrame {

  //////// Atributos
  private static final int DIVISOR = 2;
  protected int ancho;
  protected int alto;

  //////// Contructor

  /**
   * Conctuctor de la clase GeneralFrame
   */
  public GeneralFrame() {

    // Pantalla
    Toolkit pantalla = Toolkit.getDefaultToolkit();
    Dimension sizePantalla = pantalla.getScreenSize();

    this.ancho = sizePantalla.width;
    this.alto = sizePantalla.height;

    // Forma y posicion
    setSize((ancho / DIVISOR), (alto / DIVISOR));
    setLocationRelativeTo(null); // Centra la ventana en la pantalla
    setVisible(true); // Es visible la ventana
    setResizable(true); // Permite redimensionar la ventana
    setIconImage(getImage()); // Poner el icono
  }

    //////// Metodos

  /**
   * Obtener la imagen para el icono.
   * 
   * @return Image
   */
  protected Image getImage() {
    String imgPath = "/img/logo.jpg";
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource(imgPath));

    if (image == null) {
      System.err.println("No se pudo cargar el icono desde: " + imgPath);
    }

    return image;
  }
}
