class e6Params0 {
  static boolean esPar(int numeroARevisar) {
    int residuo = numeroARevisar % 2;
    if (residuo == 0){
      return true;
    }
      return false;
  }

  public static void main(String[] args) {
    boolean par = esPar(10);

    if (par == true){
      System.out.print("10 es par\n");
    } else {
      System.out.print("10 no es par\n");
    }
  }
}
