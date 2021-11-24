import java.util.Scanner;

public class tiga {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Panjang:");

        int panjang = scanner.nextInt();


        System.out.print("Lebar:");

        int lebar = scanner.nextInt();


        // panggil method di sini
        hitungLuas(panjang, lebar);
     }


    public static void hitungLuas(int panjang, int lebar){

        int luas = panjang * lebar;


        System.out.println(luas); 

     }

}