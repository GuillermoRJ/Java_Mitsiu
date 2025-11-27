class E11IntroPoo {
  public static void main(String[] args) {
    Marker marcadorBlanco = new Marker();
    marcadorBlanco.nivelTinta = 100;
    marcadorBlanco.nombreColor = "Blanco";

    Marker[] estuchePlumones = new Marker[4];

    estuchePlumones[0] = marcadorBlanco;

    for (Marker marcador : estuchePlumones) {
      System.out.print(marcador.nombreColor);
    }
  }
}

class Marker {
  short nivelTinta;
  String nombreColor;
}
