class Fibonacci {
  public static void main(
    String[] args
  ) {
    int[] serie = generateFibSerie(46);

    printSerie(serie);
  }

  static int[] generateFibSerie(
    int cant
  ) {
    if (1 >= cant || cant >= 46) {
    //if (cant <= 1 || cant >= 46) {
      System.out.println("no ok");
      return new int[0];
    }

    System.out.println("ok");
    int[] newSerie = new int[cant];
    newSerie[0] = 1;
    newSerie[1] = 1;

    for (int i = 2; i < cant; i++) {
      newSerie[i] =
        newSerie[i-1] + newSerie[i-2];
    }
    return newSerie;

  }

  static void printSerie(
    int[] pSerie
  ) {
    for(int num : pSerie) {
      System.out.println(num);
    }
  }
}

