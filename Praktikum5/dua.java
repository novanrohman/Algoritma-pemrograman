import java.util.Scanner;

public class dua {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nilai A:");

        int a = scanner.nextInt();

        System.out.print("Nilai B:");

        int b = scanner.nextInt();


        System.out.print("Nilai C:");

        int c = scanner.nextInt();

         if(a < 0 && b < 0 && c < 0){
            System.out.print(false);
        } else if(a > 0 && b < 0 && c < 0){
            System.out.print(true);
        } else if(a < 0 && b > 0 && c < 0){
            System.out.print(true);
        } else if(a < 0 && b < 0 && c > 0){
            System.out.print(true);
        }else{
            System.out.print(false);
        }

     }

}