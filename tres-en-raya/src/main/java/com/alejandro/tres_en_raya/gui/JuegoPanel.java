/**
 * JuegoPanel: Panel que se usa en la pantalla principal.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya.gui;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;

public class JuegoPanel extends GeneralPanel {

  //////// Atributos
  private JButton botonCreditos;
  private JButton botonJugar;
  // private JuegoFrame juegoFrame;

  //////// Constructor
  public JuegoPanel(JuegoFrame juegoFrame) {
    // this.juegoFrame = juegoFrame;

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
    g.setColor(new Color(173, 216, 230)); // Azul claro
    g.fillRect(0, 0, getWidth(), getHeight());
  }
}
