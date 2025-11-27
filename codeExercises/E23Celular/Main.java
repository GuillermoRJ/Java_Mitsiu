class Main {
  public static void main(String[] args) {
    Celular cel1 = new Celular(500, "abc", 2025, 0);
    int elapsed = cel1.llamar("Abuelita");
    System.out.println("La llamada duró " + (elapsed/1000) + " segundos");
  }
}
