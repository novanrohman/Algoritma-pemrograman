import java.util.Scanner;
 
public class satu  {
 
    public static void main(String[] args) {
        System.out.println("Program untuk menghitung hasil kuadrat");
        int num;
        do{
            System.out.print("Ketikkan bilangan bulat (-1 untuk keluar): ");
 
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
 
            int kuadrat = num * num;
            System.out.println("Hasil kuadrat "+ num + " = "+ kuadrat);
            System.out.println();
 
        }while (num!=-1);
    }
}