import java.util.Scanner;

public class tiga {

  public static void main(String[] args) {
    int a, hasil;
    int b = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan Angka: ");
    a = scanner.nextInt();

    System.out.println("Cetak Angka: ");
    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= a; j++) {
        hasil = i * j;
        if (hasil <= b) {
          // System.out.println(b);
          continue;
        }
        b = hasil;
        System.out.println(i + "*" + j + "=" + hasil);
      }
    }
  }
}
