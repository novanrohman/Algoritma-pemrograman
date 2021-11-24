import java.util.Scanner;

public class dua {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bilangan:");

        int bilangan = scanner.nextInt();

        int result1 = hitungKuadrat(bilangan);
        System.out.println(result1);
        
        }


    public static int hitungKuadrat(int bilangan){

        int kuadrat = bilangan * bilangan;


        return kuadrat; 

     }

}