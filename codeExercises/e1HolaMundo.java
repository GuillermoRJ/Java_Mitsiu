class HolaMundo {
  static void imprimirSaludo() {
    System.out.print("Hola");
  }

  static String obtenerSaludo() {
    return "Hola";
  }

  public static void main(String[] args) {
    imprimirSaludo();

    String saludo = obtenerSaludo();
    System.out.print(obtenerSaludo());
    obtenerSaludo();

  }
}
