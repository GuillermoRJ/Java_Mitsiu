import java.util.Scanner;
import java.util.InputMismatchException;

class E37Scanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int cantHermanos = 0;
    System.out.println("Cuantos hermanos tienes?: ");
    try {
      cantHermanos = scanner.nextInt();
    } catch(InputMismatchException ex){
      System.out.println("Excepción manejada");
    } catch(IllegalStateException ex) {
      System.out.println("Otra excepción");
    }

    System.out.println("Tienes " + cantHermanos + " hermano(s)");
  }
}
