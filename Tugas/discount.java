import java.util.Scanner;
public class discount{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan total harga: Rp. ");
        int jumlah=scanner.nextInt();
        int total;

        //Menentukan diskon
        if(jumlah > 100000){
            total=jumlah-(jumlah*5)/100;
            System.out.print("Total setelah discount: Rp. ");
            System.out.println(total);
        } else {
            System.out.print("Total yang harus di bayar: Rp. ");
            System.out.print(jumlah);
        }
    }
}