import java.util.Scanner;

public class Main {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nilai A:");

        int a = scanner.nextInt();

        System.out.print("Nilai B:");

        int b = scanner.nextInt();


        System.out.print("Nilai C:");

        int c = scanner.nextInt();

        if (a>= b && b>=c){
            System.out.print(true);
        } else if (a == b || b == c || c == a){
            System.out.print(true);
        } else {
             System.out.print(false);
        }

     }

}