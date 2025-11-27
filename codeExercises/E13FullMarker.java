class E13FullMarker {
  public static void main(String[] args) {
    Marker marcVerde = new Marker("verde");
    marcVerde.escribir("Testing");

    Marker markRojo = new Marker("rojo");
    markRojo.escribir("Testing 2");
  }
}

class Marker {
  String nombreColor;
  short nivelTinta;
  String colorTinta;

  Marker(String color) {
    this.nombreColor = color;
    this.nivelTinta = 100;

    this.colorTinta = "\u001B[0m";
    if (nombreColor == "verde") {
      this.colorTinta = "\u001B[32m";
    }
    if (nombreColor == "rojo") {
      this.colorTinta = "\u001B[31m";
    }
    if (nombreColor == "azul") {
      this.colorTinta = "\u001B[34m";
    }
  }

  void escribir(String texto) {
    System.out.print(this.colorTinta);
    for (char letra : texto.toCharArray()) {
      if (this.nivelTinta > 0) {
        System.out.print(letra);
        this.nivelTinta--;
      }
    }
    System.out.println("\u001B[0m");
  }
}
