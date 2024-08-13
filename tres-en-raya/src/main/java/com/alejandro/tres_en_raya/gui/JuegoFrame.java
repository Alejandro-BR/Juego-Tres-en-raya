/**
 * GameFrame: Ventana principal del juego.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya.gui;

// import java.awt.Frame;
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
    // Forma y posición
    // setExtendedState(Frame.MAXIMIZED_BOTH); // Pantalla completa
    // Opciones
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra el programa al cerrar ventana
    // Panel
    JuegoPanel juegoPanel = new JuegoPanel(this); // Pasamos la instancia de JuegoFrame al panel
    add(juegoPanel);
  }

  //////// Metodos

  /**
   * Mostrar los creditos
   */
  public void mostrarCreditos() {
    CreditosFrame creditosFrame = new CreditosFrame();
    creditosFrame.setVisible(true);
  }

  // Mostrar la pantalla de la partida
  public void iniciarPartida() {
    PartidaFrame partidaFrame = new PartidaFrame();
    partidaFrame.setVisible(true);
  }
}
