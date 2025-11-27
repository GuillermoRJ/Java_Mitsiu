import java.util.Scanner;

/**
 * Este programa es una representación virtual de una clinica.
 */
public class Clinica {
  /**
  * Esta es la función principal.
  */
  public static void main(String[] args) throws Exception {

    int edad;
    edad = 3;

    Medico medico1; // crear una variable de tipo Medico con nombre medico1
    // INSERT INTO medico SET (1, "Felipe" ...)
    medico1 = new Medico();

    Scanner myScanner = new Scanner(System.in);

    int input = myScanner.nextInt(16);
    System.out.println(input);

  }
}
