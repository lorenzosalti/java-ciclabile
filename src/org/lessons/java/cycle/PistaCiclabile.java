package org.lessons.java.cycle;

public class PistaCiclabile {

  // ATTRIBUTES
  private int currentElementIndex = 0;
  private int[] elements;

  // CONSTRUCTORS
  public PistaCiclabile(int[] elements) {
    this.elements = elements;
  }

  // METHODS
  public int getElementoSuccessivo() {
    int element = elements[currentElementIndex];
    currentElementIndex++;
    return element;
  }

  public boolean hasAncoraElementi() {
    return currentElementIndex < this.elements.length;
  }

  // BONUS
  public PistaCiclabile() {
    this.elements = new int[0];
  }

  public void addElemento(int elementToAdd) {

    int[] newElements = new int[this.elements.length + 1];

    for (int i = 0; i < this.elements.length; i++) {
      int currentElement = this.elements[i];
      newElements[i] = currentElement;
    }

    newElements[newElements.length - 1] = elementToAdd;

    this.elements = newElements;
  }

  /*
   * creare un nuovo array di lunghezza pari a quello attuale + 1
   * ciclare sul vecchio array per reinserire tutti i vecchi elementi in quello
   * nuovo
   * finito il ciclco aggiungere l'elemento passato come parametro
   * sovrascrivere il vecchio array con il nuovo
   */
}
