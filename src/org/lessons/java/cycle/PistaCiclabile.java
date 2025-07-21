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
}
