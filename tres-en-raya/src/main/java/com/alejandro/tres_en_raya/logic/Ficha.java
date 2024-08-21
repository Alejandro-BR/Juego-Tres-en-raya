/**
 * Ficha
 * 
 * Representa las piezas utilizadas en el juego dentro del tablero.
 *
 *  @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya.logic;

public class Ficha {

  //////// Atributos
  private String simbolo;

  //////// Contructores

  /**
   * Constructor por defecto
   * Simbolo = " "
   */
  public Ficha() {
    this.simbolo = " ";
  }

  /**
   * Constructor con simbolo
   * 
   * @param simbolo String
   */
  public Ficha(String simbolo) {
    this.simbolo = simbolo;
  }

  //////// Metodos

  /**
   * Metodo para obtener el simbolo de la ficha
   * 
   * @return String simbolo
   */
  public String getSimbolo() {
    return simbolo;
  }

  /**
   * Metodo para establecer el simbolo de la ficha
   * 
   * @param simbolo String
   */
  public void setSimbolo(String simbolo) {
    this.simbolo = simbolo;
  }

  /**
   * toString de la clase Ficha.
   */
  @Override
  public String toString() {
    return simbolo;
  }

  /**
   * equals de la clase Ficha.
   * 
   * @param obj Object
   * @return boolean
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Ficha ficha = (Ficha) obj;
    return simbolo.equals(ficha.simbolo);
  }

  /**
   * hashCode de la clase Ficha.
   * 
   * @return int
   */
  @Override
  public int hashCode() {
    return simbolo.hashCode();
  }

  /**
   * Metodo estaticos para obtener simbolos predeterminados
   * 
   * @param indice int
   * @return String
   */
  public static String obtenerSimbolo(int indice) {
    switch (indice) {
      case 0:
        return "X";
      case 1:
        return "O";
      default:
        return " ";
    }
  }
}
