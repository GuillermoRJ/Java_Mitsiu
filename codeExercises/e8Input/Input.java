import java.util.Scanner;

public class Input {
  public static int scan(String prompt){
    System.out.print(prompt);
    Scanner scanner = new Scanner(System.in);

    int answer = scanner.nextInt();
    return answer;
  }
}
