class E7Suma {
  static int suma(int a, int b) {
    return a + b;
  }

  static void imprimirResultado(int resultado) {
    System.out.print("El resultado es: " + resultado + "\n");
  }

  public static void main(String[] args) {
    int resultadoSuma = suma(1, -3);

    imprimirResultado(resultadoSuma);

    imprimirResultado(suma(10, 4));
  }
}
// TAREA!
