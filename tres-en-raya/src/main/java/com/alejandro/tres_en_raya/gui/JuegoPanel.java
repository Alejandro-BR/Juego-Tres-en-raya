/**
 * JuegoPanel: Panel que se usa en la pantalla principal.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya.gui;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Color;

public class JuegoPanel extends GeneralPanel {

  //////// Atributos
  private static final String TITULO = "JUEGO TRES EN RAYA";
  private static final int MARGEN_SUPERIOR = 40;
  private static final Font FUENTE_TITULO = new Font("SansSerif", Font.BOLD, 24);

  //////// Metodos
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Configurar la fuente para el titulo
    g.setFont(FUENTE_TITULO);
    g.setColor(Color.BLACK); // Color del texto

    // Calcular la posición X centrada
    FontMetrics metrics = g.getFontMetrics(FUENTE_TITULO);
    int x = (getWidth() - metrics.stringWidth(TITULO)) / DIVISOR;
    int y = MARGEN_SUPERIOR + metrics.getAscent(); // Posicionar el texto con un margen superior

    // Dibujar
    g.drawString(TITULO, x, y);
  }
}
