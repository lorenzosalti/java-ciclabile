package org.lessons.java.cycle;

public class PistaCiclabile {

  // ATTRIBUTES
  private int currentElement;
  private int[] elements;

  // CONSTRUCTORS
  public PistaCiclabile(int[] elements) {
    this.elements = elements;
  }

  // METHODS
  public int getElementoSuccessivo() {
    return elements[currentElement];
  }

  public boolean hasAncoraElementi() {
    return currentElement == (elements.length - 1);
  }
}
