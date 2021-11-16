import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkkan nilai p:");
        int p= scanner.nextInt();
        System.out.print("Masukkkan nilai q:");
        int q= scanner.nextInt();
        System.out.print("Masukkkan nilai r:");
        int r= scanner.nextInt();

        if(p^q^r){
            if (p>q){
                System.out.println(p);
            } else if (q>r){
                System.out.println(q);
            } else if (r>p){
                System.out.println(r);
            } else {
                System.out.println(p);
            }
        else {
            return 0;
        }
    }
}