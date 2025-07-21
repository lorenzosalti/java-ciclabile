package org.lessons.java.cycle;

public class Main {
  public static void main(String[] args) {

    int[] daUnoADieci = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    PistaCiclabile daCiclare = new PistaCiclabile(daUnoADieci);

    System.out.println(daCiclare.hasAncoraElementi()); // true
    System.out.println(daCiclare.getElementoSuccessivo()); // 1
    System.out.println(daCiclare.getElementoSuccessivo()); // 2
    System.out.println(daCiclare.getElementoSuccessivo()); // 3
    System.out.println(daCiclare.hasAncoraElementi()); // true
    System.out.println(daCiclare.getElementoSuccessivo()); // 4
    System.out.println(daCiclare.getElementoSuccessivo()); // 5
    System.out.println(daCiclare.hasAncoraElementi()); // true
    System.out.println(daCiclare.getElementoSuccessivo()); // 6
    System.out.println(daCiclare.getElementoSuccessivo()); // 7
    System.out.println(daCiclare.hasAncoraElementi()); // true
    System.out.println(daCiclare.getElementoSuccessivo()); // 8
    System.out.println(daCiclare.getElementoSuccessivo()); // 9
    System.out.println(daCiclare.hasAncoraElementi()); // true
    System.out.println(daCiclare.getElementoSuccessivo()); // 10
    System.out.println(daCiclare.hasAncoraElementi()); // false

  }
}
