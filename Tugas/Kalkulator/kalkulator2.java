import java.util.Scanner;

public class kalkulator2 {

    public static void main(String[] args) {
        String operator;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bilangan a:");
        int a = scanner.nextInt();
        System.out.print("operator :");
         operator = scanner.next();
        System.out.print("Bilangan b:");
        int  b = scanner.nextInt();

        switch (operator){
            case "+":
                tambah( a, b);
                break;
            case  "-":
                kurang( a, b);
                break;
            case "*":
                kali( a, b);
                break;
            case "/":
                bagi(a,b);
            default:
                System.out.println("operator "+operator+" tidak ditemukan");
        }
    }

    public static void tambah(int a, int b){
       int  hasil = a + b;
        System.out.println("hasil = " +hasil);
    }
    public static void kurang(int a, int b){
        int  hasil = a - b;
        System.out.println("hasil = " +hasil);
    }
    public static void bagi(int a, int b){
        int  hasil = a / b;
        System.out.println("hasil = " +hasil);
    }
    public static void kali(int a, int b){
        int  hasil = a * b;
        System.out.println("hasil = " +hasil);
    }

}