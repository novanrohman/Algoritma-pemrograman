import java.util.Scanner;

public class NumberFormatException {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    // kemungkinan exception
    if (input.matches("\\d+")) {
      int number = Integer.parseInt(input);
      System.out.println(number + 1);
    } else {
      System.out.println("Angka yang salah : " + input);
    }
  }
}