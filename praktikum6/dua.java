import java.util.Scanner;

public class dua {

  public static void main(String[] args) {
    int bil_dasar, bil_eksponen;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan bilangan dasar: ");
    bil_dasar = scanner.nextInt();
    System.out.print("Masukkan bilangan eksponen: ");
    bil_eksponen = scanner.nextInt();
    int hasil=1;
    // hasil=bil_dasar;
    for (int i=0; i<bil_eksponen; i++) {
      hasil=hasil*bil_dasar; //hasil perkalian akan di simpan ke variabel hasil

    }
        System.out.println(hasil);
    // System.out.println(Math.pow(bil_dasar,bil_eksponen));
  }
}
