/**
 * Modulacion de la clase TituloPanel
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.FontMetrics;
import javax.swing.JPanel;

public class TituloPanel extends JPanel {

  //////// Atributos
  private static final String TITULO = "JUEGO TRES EN RAYA";
  private static final Font FUENTE_TITULO = new Font("SansSerif", Font.BOLD, 24);
  private static final int MARGEN_SUPERIOR = 40;

  //////// Constructor
  public TituloPanel() {
    setPreferredSize(new Dimension(400, 100));
    setOpaque(false); // Hace que el panel sea transparente
  }

  //////// Metodos

  /**
   * Override de paintComponent
   * Metodo heredado de JPanel
   * 
   * @param g Graphics
   */
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Establecer el color del texto
    g.setFont(FUENTE_TITULO);
    g.setColor(Color.BLACK);

    FontMetrics metrics = g.getFontMetrics(FUENTE_TITULO);
    int x = (getWidth() - metrics.stringWidth(TITULO)) / 2;
    int y = MARGEN_SUPERIOR + metrics.getAscent();

    // Dibujar el título
    g.drawString(TITULO, x, y);
  }
}
