import java.util.Scanner;
import java.util.InputMismatchException;

class E36Scanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int cantHermanos = 0;
    System.out.print("Ingresa la cantidad de hermanos que tienes: ");
    try {
      scanner.close();
      cantHermanos = scanner.nextInt();

      if (cantHermanos < 0 ){
        System.out.println("Numeros negativos no son validos");
        cantHermanos = 0;
      }
      System.out.println("Ok");
    }
    catch(IllegalStateException ex) {
      System.out.println("Excepción distinta");
    }
    catch(InputMismatchException gatitos){
      System.out.println("Número no valido");
      System.out.println(gatitos);
    }

    System.out.println("Tienes " + cantHermanos + " hermano(s)");
  }
}
