/**
 * Tablero
 * 
 * Es una matriz de fichas con una proporción de 3x3.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package com.alejandro.tres_en_raya.logic;

public class Tablero {

  //////// Atributos
  private Ficha[][] fichas;
  private static final int CASILLAS = 3;

  //////// Constructor

  /**
   * Constructor de la clase Tablero.
   * 
   * Inicializa el tablero como una matriz 3x3 y lo llena con fichas vacias.
   */
  public Tablero() {
    fichas = new Ficha[CASILLAS][CASILLAS];
    inicializarTablero();
  }

  //////// Metodos

  /**
   * Inicializa el tablero.
   * 
   * Llena todas las posiciones del tablero con fichas vacias.
   */
  public void inicializarTablero() {
    for (int i = 0; i < CASILLAS; i++) {
      for (int j = 0; j < CASILLAS; j++) {
        fichas[i][j] = new Ficha();
      }
    }
  }

  /**
   * Comprueba si la ficha en una determinada posicion del tablero es igual a la
   * ficha dada.
   * 
   * @param altura int La fila del tablero.
   * @param base   int La columna del tablero.
   * @param ficha  Ficha La ficha a comparar.
   * @return boolean True si la ficha en la posicion especifica es igual a la
   *         ficha dada, false en caso contrario.
   */
  public boolean comprobar(int altura, int base, Ficha ficha) {
    return fichas[altura][base].equals(ficha);
  }

  /**
   * Comprueba si el espacio en una determinada posicion del tablero esta libre.
   * 
   * @param altura int La fila del tablero.
   * @param base   int La columna del tablero.
   * @return boolean True si el espacio esta libre, false en caso contrario.
   */
  public boolean espacioLibre(int altura, int base) {
    Ficha fichaAux = new Ficha();
    return comprobar(altura, base, fichaAux);
  }

  /**
   * Comprueba si el tablero esta lleno.
   * 
   * @return boolean True si no hay espacios libres en el tablero, false en caso
   *         contrario.
   */
  public boolean lleno() {
    Ficha fichaAux = new Ficha();
    boolean lleno = true;

    for (int i = 0; i < fichas.length; i++) {
      for (int j = 0; j < fichas[i].length; j++) {
        if (fichas[i][j].equals(fichaAux)) {
          lleno = false;
        }
      }
    }

    return lleno;
  }

  /**
   * Coloca una ficha en una determinada posicion del tablero.
   * 
   * @param altura int La fila del tablero.
   * @param base   int La columna del tablero.
   * @param ficha  Ficha La ficha a colocar.
   */
  public void colocarFicha(int altura, int base, Ficha ficha) {
    fichas[altura][base] = ficha;
  }

  /**
   * Obtiene la matriz de fichas del tablero.
   * 
   * @return Ficha[][] La matriz de fichas del tablero.
   */
  public Ficha[][] getFichas() {
    return fichas;
  }
}