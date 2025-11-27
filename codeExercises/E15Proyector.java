class Proyector {
  String color;
  String modelo;
  float[] dimensiones;
  boolean encendido;

  Proyector() {
    this.dimensiones = new float[3];
    this.encendido = false;
  }

  void botonPower() {
    this.encendido = !this.encendido;
  }

  void proyectar(String textoAProyectar) {
    if (this.encendido) {
      System.out.println(textoAProyectar);
    }
  }
}

class E15Proyector {
  public static void main(String[] args) {
    Proyector lab502 = new Proyector();
    lab502.botonPower();
    lab502.proyectar("Hola");
    lab502.botonPower();
    lab502.proyectar("Hola");
  }
}

