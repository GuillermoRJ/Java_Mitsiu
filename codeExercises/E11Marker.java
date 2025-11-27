class E11Marker {
  public static void main(String[] args) {
    Marker marcadorNegro = new Marker();
    marcadorNegro.escribir("Bienvenidos a la clase POO");

    GreenMarker marcadorVerde = new GreenMarker();
    marcadorVerde.escribir("¿Estamos aprendiendo?");

    RedMarker marcadorRojo = new RedMarker();
    marcadorRojo.escribir("Espero que si");
  }
}

class Marker {
  String colorTinta = "\u001B[0m";
  String nombreColor = "Negro";
  short nivelTinta = 100;

  void escribir(String texto) {
    for (char letra : texto.toCharArray()) {
      if (this.tinta > 0) {
        System.out.print(this.colorTinta + letra);
        this.nivelTinta--;
      }
    }
    System.out.println();
  }
}

class GreenMarker extends Marker {
  GreenMarker() {
    this.colorTinta = "\u001B[32m";
    this.nombreColor = "Verde";
  }
}

class RedMarker extends Marker {
  RedMarker() {
    this.colorTinta = "\u001B[31m";
    this.nombreColor = "Rojo";
  }
}
