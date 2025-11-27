class App {
  public static void main(String[] args) {
    Persona p = new Persona("1234-1234-1234-1234");
    p.setNumeroTarjeta("1234-1234-1234-1234-4321");
    System.out.println("Mi número de tarjeta es: " + p.getNumeroTarjeta());
  }
}
