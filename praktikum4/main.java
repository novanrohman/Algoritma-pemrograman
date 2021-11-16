import java.util.Scanner;
public class main{    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkkan nilai a:");
        int a= scanner.nextInt();
        System.out.print("Masukkkan nilai b:");
        int b= scanner.nextInt();

        if(a==b){
            System.out.println(a);
            System.out.println(b);
        } else if (a>b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}

// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Masukkan Total Biaya: ");
//         int total_biaya = scanner.nextInt();
//         double total_bayar = 0;

//         if (total_biaya > 100000){
//             total_bayar = total_biaya - (total_biaya * 0.05);
//         } else {
//             total_bayar = total_biaya;
//         }

//         System.out.println("Total yang harus di bayar: " + total_bayar);
//     }
// }