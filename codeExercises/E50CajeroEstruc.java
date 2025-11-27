class App {
  public static void main(String[] args) {
    float dinero = 0;

    System.out.println(saldo(dinero));
    dinero = deposito(dinero, 100);
    dinero = retiro(dinero, 25);
    System.out.println(saldo(dinero));

  }

  static float deposito(float dinero, float cant) {
    return dinero + cant;
  }

  static float retiro(float dinero, float cant) {
    if (cant > 0 && cant <= dinero){
      return dinero - cant;
    }
    return dinero;
  }

  static float saldo(float dinero){
    return dinero;
  }
}
