import java.util.ArrayList;

class E18ArrayList {
  public static void main(String[] args) {
    int[] numerosPares = new int[4];
    numerosPares[0] = 2;
    numerosPares[1] = 4;
    numerosPares[2] = 6;
    numerosPares[3] = 8;

    ArrayList<Integer> numerosParesMejorado = new ArrayList<Integer>();
    numerosParesMejorado.add(2);
    numerosParesMejorado.add(4);
    numerosParesMejorado.add(6);

    System.out.println(numerosParesMejorado);

    System.out.println(numerosParesMejorado.get(0));
  }
}
