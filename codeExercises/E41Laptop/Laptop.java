class Laptop {
  Pantalla pantalla;
  boolean encendido;

  Laptop(){
    this.pantalla = new Pantalla();
  }

  void encender() {
    this.encendido = true;
  }

  void encenderPantalla() throws Exception{
    if(!this.encendido) {
      throw new Exception("Apagado");
    }
    this.pantalla.encender();
  }
}
