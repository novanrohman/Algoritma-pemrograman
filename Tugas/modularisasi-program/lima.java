import java.util.Scanner;

public class lima {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bilangan a:");

        int a = scanner.nextInt();

        System.out.print("Bilangan b:");

        int  b = scanner.nextInt();

        System.out.println(kali( a, b));        // pemanggilan method kali

     }

     // kode program akan disisipkan di sini
    public static int kali(int a, int b){
      int hasil = a*b;
      return hasil;
    }
}