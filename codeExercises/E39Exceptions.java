import java.util.NoSuchElementException;
import java.util.InputMismatchException;
import java.util.Scanner;

class E39Exceptions {
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      sc.nextInt();
      throw new NoSuchElementException("Test");
      System.out.print("Unreachable");
    } catch (InputMismatchException ex){
      System.out.println("Ex 1");
    } catch (IllegalStateException ex) {
      System.out.println("Ex 2");
    } catch (Exception ex) {
      System.out.println("Ex 3");
    }
  }
}
