/**
 * JuegoPanel: Panel que se usa en la pantalla principal.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya.gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;

public class JuegoPanel extends GeneralPanel {

  //////// Atributos
  private JButton botonCreditos;
  private JButton botonJugar;

  //////// Constructor
  public JuegoPanel(JuegoFrame juegoFrame) {

    // Configurar layout
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10);

    // Configurar los botones
    botonCreditos = new JButton("Créditos");
    botonJugar = new JButton("Jugar");

    botonCreditos.setPreferredSize(new Dimension(200, 50));
    botonJugar.setPreferredSize(new Dimension(200, 50));

    // ActionListener de los botones
    botonCreditos.addActionListener(e -> juegoFrame.mostrarCreditos());
    botonJugar.addActionListener(e -> juegoFrame.iniciarPartida());

    // Titulo y botones
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 2;
    gbc.anchor = GridBagConstraints.CENTER;
    add(new TituloPanel(), gbc);

    gbc.gridwidth = 1;
    gbc.gridy = 1;
    add(botonCreditos, gbc);

    gbc.gridy = 2;
    add(botonJugar, gbc);
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

    // Fondo degradado entre blanco y azul claro
    Graphics2D g2d = (Graphics2D) g;
    int width = getWidth();
    int height = getHeight();
    GradientPaint gp = new GradientPaint(0, 0, Color.WHITE, 0, height, new Color(173, 216, 230));
    g2d.setPaint(gp);
    g2d.fillRect(0, 0, width, height);
  }
}
