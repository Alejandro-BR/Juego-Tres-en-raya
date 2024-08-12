/**
 * CreditosPanel: Panel que se usa en los creditos.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya.gui;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Desktop;
import java.net.URI;

public class CreditosPanel extends GeneralPanel {

  //////// Atributos
  private static final String TITULO = "CREDITOS";
  private static final String NOMBRE_AUTOR = "Desarrollado por: Alejandro Barrionuevo Rosado";
  private static final String ENLACE_GITHUB = "https://github.com/Alejandro-BR/Juego-Tres-en-raya";
  private static final int MARGEN_SUPERIOR = 40;
  private static final Font FUENTE_TITULO = new Font("Comic Sans MS", Font.BOLD, 28);
  private static final Font FUENTE_TEXTO = new Font("Comic Sans MS", Font.PLAIN, 18);

  //////// Constructor

  /**
   * Contructor basico de la clase CreditosPanel
   */
  public CreditosPanel() {
    setOpaque(true);
    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        try {
          Desktop.getDesktop().browse(new URI(ENLACE_GITHUB));
        } catch (Exception ex) {
          ex.printStackTrace();
        }
      }
    });
  }

  //////// Metodos

  /** 
   * Override de paintComponent 
   * Metodo heredado de JPanel
   * 
   * @param g Graphics
   */
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2d = (Graphics2D) g;
    int width = getWidth();
    int height = getHeight();

    // Fondo con degradado entre blanco y azul claro
    GradientPaint gp = new GradientPaint(0, 0, Color.WHITE, 0, height, new Color(173, 216, 230));
    g2d.setPaint(gp);
    g2d.fillRect(0, 0, width, height);

    // Activar antialiasing para mejorar el renderizado del texto
    g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

    // Dibujar el titulo con sombra
    g2d.setFont(FUENTE_TITULO);
    FontMetrics metrics = g2d.getFontMetrics(FUENTE_TITULO);
    int x = (width - metrics.stringWidth(TITULO)) / 2;
    int y = MARGEN_SUPERIOR + metrics.getAscent();

    g2d.setColor(Color.GRAY); // Sombra
    g2d.drawString(TITULO, x + 2, y + 2);
    g2d.setColor(new Color(0, 51, 102)); // Texto en azul oscuro
    g2d.drawString(TITULO, x, y);

    // Dibujar el nombre del autor con sombra
    g2d.setFont(FUENTE_TEXTO);
    metrics = g2d.getFontMetrics(FUENTE_TEXTO);
    y += metrics.getHeight() + 40;

    x = (width - metrics.stringWidth(NOMBRE_AUTOR)) / 2;
    g2d.setColor(Color.GRAY); // Sombra
    g2d.drawString(NOMBRE_AUTOR, x + 1, y + 1);
    g2d.setColor(new Color(0, 51, 102)); // Texto en azul oscuro
    g2d.drawString(NOMBRE_AUTOR, x, y);

    // Dibujar el enlace a GitHub con sombra
    y += metrics.getHeight() + 20;
    x = (width - metrics.stringWidth(ENLACE_GITHUB)) / 2;
    g2d.setColor(Color.GRAY); // Sombra 
    g2d.drawString(ENLACE_GITHUB, x + 1, y + 1);
    g2d.setColor(new Color(0, 153, 204)); // Texto en azul claro
    g2d.drawString(ENLACE_GITHUB, x, y);
  }
}
