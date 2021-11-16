import java.util.Scanner;

public class dua {

  public static void main(String[] args) {
    int bil_dasar, bil_eksponen;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan bilangan dasar: ");
    bil_dasar = scanner.nextInt();
    System.out.print("Masukkan bilangan eksponen: ");
    bil_eksponen = scanner.nextInt();

    for (int i=0; i<bil_eksponen; i++) {
        // System.out.println(bil_dasar);

    
    }
    System.out.println(Math.pow(bil_dasar,bil_eksponen));
  }
}
