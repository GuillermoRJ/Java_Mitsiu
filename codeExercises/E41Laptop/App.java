class App {
  public static void main(String[] args) {
    Laptop lap = new Laptop();
    try {
      lap.encender();
      lap.encenderPantalla();
    } catch (Exception ex) {
      System.out.println(ex);
      System.out.println("Manejado");
    }
    System.out.println("Fin");
  }
}
