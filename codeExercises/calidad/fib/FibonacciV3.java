class Fibonacci {
  public static void main(
    String[] args
  ) {
    int[] serie = generateFibSerie(0);
System.out.println("Still alive?");
    printSerie(serie);
  }

  static int[] generateFibSerie(
    int cant
  ) {
    try {
      System.out.println("ok");
      int[] newSerie = new int[cant];
      System.out.println("ok2");
      newSerie[0] = 1;
      newSerie[1] = 1;

      for (int i = 2; i < cant; i++) {
        newSerie[i] =
          newSerie[i-1] + newSerie[i-2];
      }
      return newSerie;
    } catch(NegativeArraySizeException ex) {
      System.out.print("Excepción cachada");
      return new int[0];
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.print("Excepción 2 cachada");
      return new int[0];
    }

  }

  static void printSerie(
    int[] pSerie
  ) {
    for(int num : pSerie) {
      System.out.println(num);
    }
  }
}

