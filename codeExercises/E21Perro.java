class E21Perro {
  public static void main(String[] args) {
    Perro p = new Perro();
    p.nivelLadrido = 0.5f;

    p.ladrar("WWHHOOOFfF");
  }
}

class Perro {
  float nivelLadrido;

  void ladrar(String sonido){

    for (char letra : sonido.toCharArray()){
      boolean upper = Math.random() < this.nivelLadrido ;
      if (upper){
        System.out.print(Character.toUpperCase(letra));
      } else {
        System.out.print(Character.toLowerCase(letra));
      }
    }
  }
}
