class E48PolimOverloading {
  public static void main(String[] args) {
    Materia m = new Materia();
    // guardarCalif(String, int);
    m.guardarCalif("Apro", 2);
    // guardarCalif(int, String);
    m.guardarCalif(2, "Apro");

    // guardarCalif(int)
    m.guardarCalif(8);
  }
}

class Materia {
  void guardarCalif(int calif, String otro){
    System.out.println("Met 3");
  }
  void guardarCalif(String calif, int unidad){
    System.out.println(
      "Met 1 - Unidad: "
      + unidad
      + " calif: "
      + calif);
  }

  void guardarCalif(int calif){
    System.out.println("Met 2 - Nota: " + calif);
  }
}
