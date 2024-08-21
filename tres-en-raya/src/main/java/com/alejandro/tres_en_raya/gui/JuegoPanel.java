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
import javax.swing.BorderFactory;
// import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

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
    botonCreditos = crearBoton("Creditos");
    botonJugar = crearBoton("Jugar");

    // ActionListener de los botones
    botonCreditos.addActionListener(e -> juegoFrame.mostrarCreditos());
    botonJugar.addActionListener(e -> juegoFrame.iniciarPartida());

    // Titulo
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 2;
    gbc.anchor = GridBagConstraints.CENTER;
    add(new TituloPanel(), gbc);

    // Posicionar los botones en la misma fila
    gbc.gridwidth = 1; // Cada boton ocupara solo una celda
    gbc.gridy = 1; // Ambos botones en la misma fila

    // Anadir boton "Jugar" en la primera columna
    gbc.gridx = 0;
    add(botonJugar, gbc);

    // Anadir boton "Creditos" en la segunda columna
    gbc.gridx = 1;
    add(botonCreditos, gbc);
  }

  //////// Metodos

  /**
   * Crear un boton con estilo moderno
   * 
   * @param texto String - Texto del boton
   * @return JButton - Boton configurado
   */
  private JButton crearBoton(String texto) {
    JButton boton = new JButton(texto);
    boton.setPreferredSize(new Dimension(200, 50));
    boton.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // Fuente moderna

    // Borde redondeado
    boton.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true)); // Borde con contorno gris
    boton.setBackground(new Color(240, 240, 240)); // Fondo claro
    boton.setForeground(Color.BLACK); // Texto en negro
    boton.setFocusPainted(false); // Eliminar borde de enfoque
    boton.setOpaque(true);
    boton.setContentAreaFilled(true);

    // Efecto hover
    boton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        boton.setBackground(new Color(220, 220, 220)); // Color más oscuro al pasar el ratón
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        boton.setBackground(new Color(240, 240, 240)); // Color original cuando no está el ratón
      }
    });

    // Agregar enfoque resaltado
    boton.addFocusListener(new FocusListener() {
      @Override
      public void focusGained(FocusEvent e) {
        boton.setBackground(new Color(200, 200, 200)); // Color más oscuro cuando está enfocado
      }

      @Override
      public void focusLost(FocusEvent e) {
        boton.setBackground(new Color(240, 240, 240)); // Color original cuando pierde el enfoque
      }
    });

    return boton;
  }

  /**
   * Override de paintComponent Metodo heredado de JPanel
   * 
   * @param g Graphics
   */
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Establecer el fondo con un degradado
    Graphics2D g2d = (Graphics2D) g;
    int width = getWidth();
    int height = getHeight();
    GradientPaint gp = new GradientPaint(0, 0, Color.WHITE, 0, height, new Color(173, 216, 230));
    g2d.setPaint(gp);
    g2d.fillRect(0, 0, width, height);
  }
}
