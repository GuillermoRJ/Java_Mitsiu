class Electronico {
  boolean encendido;
  String modelo;
  String marca;
  int anio;
  Componente[] componentes;

  Electronico(){
    this.modelo = "xzc";
    this.anio = 2025;
    this.componentes = new Componente[0];
  }

  Electronico(String model, int ani, int cantComponentes) {
    this.modelo = model;
    this.anio = ani;
    this.componentes = new Componente[cantComponentes];
  }

  boolean encender(){
    this.encendido = true;
    System.out.println("Encendido");
    return this.encendido;
  }

  boolean apagado() {
    this.encendido = false;
    System.out.println("Apagado");
    return this.encendido;
  }
}
