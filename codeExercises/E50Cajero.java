class App {
  public static void main(String[] args) {
    Cajero c = new Cajero();
    System.out.println(c.saldo());
    c.deposito(100);
    c.retiro(25);
    System.out.println(c.saldo());
  }
}

class Cajero {
  private float dinero;

  void deposito(float cant){
    this.dinero = this.dinero + cant;
  }

  void retiro(float cant){
    if (cant > 0 && cant <= dinero){
      this.dinero = this.dinero - cant;
    }else {
      System.out.println("No valido");
    }
  }

  float saldo(){
    return this.dinero;
  }
}
