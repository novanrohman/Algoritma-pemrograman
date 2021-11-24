import java.util.Scanner;

public class empat {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bilangan a:");

        int a = scanner.nextInt();

        System.out.print("Bilangan b:");

        int  b = scanner.nextInt();

        tambah( a, b);        // pemanggilan method tambah
     }

     // kode program akan disisipkan di sini
    public static void tambah(int a, int b){
      int hasil = a+b;
      System.out.println(hasil);
    }
}