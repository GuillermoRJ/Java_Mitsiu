// Clase principal aquí esta funcion main
class E16FullMarker {
  public static void main(String[] args) {
    Marker plumonBlanco = new Marker("Blanco");

    plumonBlanco.escribir("Hola");
  }
 }

// Clase marker para crear objetos marker
class Marker {
  // Atributos
  short nivelTinta;
  String nombreColor;
  String codigoTinta;

  Marker(String nomColorParam) {
    this.nombreColor = nomColorParam;
    this.nivelTinta = 100;
  }

  // Método - Algo que los markers pueden hacer
  void escribir(String textoAEscribir) {
    System.out.print(textoAEscribir);
  }
}
