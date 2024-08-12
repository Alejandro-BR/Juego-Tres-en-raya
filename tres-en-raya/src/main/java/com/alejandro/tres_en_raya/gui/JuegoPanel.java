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
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JuegoPanel extends GeneralPanel {

  //////// Atributos
  private static final String TITULO = "JUEGO TRES EN RAYA";
  private static final int MARGEN_SUPERIOR = 40;
  private static final Font FUENTE_TITULO = new Font("SansSerif", Font.BOLD, 24);
  private JButton botonCreditos;
  private JButton botonJugar;
  private JuegoFrame juegoFrame;

  //////// Constructor

  public JuegoPanel(JuegoFrame juegoFrame) {
    this.juegoFrame = juegoFrame;

    // Configurar layout
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10);

    // Configurar los botones
    botonCreditos = new JButton("Créditos");
    botonJugar = new JButton("Jugar");

    botonCreditos.setPreferredSize(new Dimension(200, 50));
    botonJugar.setPreferredSize(new Dimension(200, 50));

    // Añadir ActionListener a los botones
    botonCreditos.addActionListener(e -> juegoFrame.mostrarCreditos());
    botonJugar.addActionListener(e -> juegoFrame.iniciarPartida());

    // Añadir el título al panel
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 2;
    gbc.anchor = GridBagConstraints.CENTER;
    add(new TituloPanel(), gbc);

    // Añadir botones al panel
    gbc.gridwidth = 1;
    gbc.gridy = 1;
    add(botonCreditos, gbc);

    gbc.gridy = 2;
    add(botonJugar, gbc);
  }

  //////// Métodos
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Establecer fondo del panel
    g.setColor(new Color(173, 216, 230)); // Azul claro
    g.fillRect(0, 0, getWidth(), getHeight());
  }

  private class TituloPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      // Configurar la fuente para el título
      g.setFont(FUENTE_TITULO);
      g.setColor(Color.BLACK); // Color del texto

      // Calcular la posición X centrada
      FontMetrics metrics = g.getFontMetrics(FUENTE_TITULO);
      int x = (getWidth() - metrics.stringWidth(TITULO)) / 2;
      int y = MARGEN_SUPERIOR + metrics.getAscent(); // Posicionar el texto con un margen superior

      // Dibujar
      g.drawString(TITULO, x, y);
    }

    @Override
    public Dimension getPreferredSize() {
      return new Dimension(400, 100); // Tamaño preferido para el panel del título
    }
  }
}
