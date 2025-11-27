class Perro extends Animal {
  String pelaje;
  int nivelOlfato;
  int nivelLadrido;

  Perro(int nivelOlfat){
    this.nivelOlfato = nivelOlfat;
  }

  void ladrar(String sonido) {
    System.out.println(sonido);
  }

  void serValiente(float cuantasScoobyG){
    super.comer("ScoobyGalletas", cuantasScoobyG);
    System.out.print("Scooby-doby-doo");
  }
}
