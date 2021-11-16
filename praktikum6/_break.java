import java.util.Scanner;
public class _break{
    public static void main(String[] argas){
        Double number, sum=0.0;
        Scanner input = new Scanner(System.in);

        
        //ketika kondisi benar, maka perintah input akan terus muncul
        while (true){
            System.out.print("Enter a number: ");
            number = input.nextDouble();

            //berfungsi untuk menghentikan program jika number < 0
            if (number < 0.0){
                break;
            }
            sum +=number; //menjumlahkan nilai number sebelumnya dengan nilai number baru
        }
        System.out.println("Sum = " + sum); //mencetak nilai sum
    }
}