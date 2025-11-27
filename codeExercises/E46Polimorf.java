class E46Polimorf {
  public static void main(String[] args){
    Persona mit = new Persona();
    // Overloading
    mit.hablar(1f, "Hola");
    mit.hablar("callense", 1f);
  }
}

class Persona {
  //hablar(String)
  void hablar(String sonido) {
    System.out.println(sonido);
  }
  // hablar(float, string)
  void hablar(float volumen, String sonido){
    System.out.println("Otro método");
  }
  //hablar(String, float)
  void hablar(String sonido, float volumen){
    for (char letra : sonido.toCharArray()){
      boolean upper = Math.random() < volumen;
      if (upper){
        System.out.print(Character.toUpperCase(letra));
      } else {
        System.out.print(Character.toLowerCase(letra));
      }
    }
    System.out.println();
  }
}


