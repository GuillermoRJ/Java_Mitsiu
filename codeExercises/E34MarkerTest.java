class E34MarkerTest {
  public static void main(String[] args) {
    GreenMarker m  = new GreenMarker(2.5f);
    m.escribir("Test");
  }
}

class Marker {
  short nivelTinta = 100;
  float grosorPunta;

  Marker(float grosor) {
    this.grosorPunta = grosor;
  }

  void escribir(String texto) {
    System.out.println(texto);
  }
}

class GreenMarker extends Marker {
  String colorTinta;

  GreenMarker(float grosor){
    super(grosor);
    this.colorTinta = "Green";
    this.grosorPunta = grosorPunta;
  }
}
