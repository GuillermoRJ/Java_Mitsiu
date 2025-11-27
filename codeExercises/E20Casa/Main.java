class Main {
  public static void main(String[] args) {
    Persona alex = new Persona();
    alex.nombre = "Alejandro";

    Cocina miCocina = new Cocina();
    miCocina.muebles.add("Estufa");


    boolean entro = miCocina.entrar(alex);
    System.out.println(alex.nombre + " entro: " + entro);

    System.out.println(miCocina.altura);
  }
}
