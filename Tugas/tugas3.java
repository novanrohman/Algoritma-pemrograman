import java.util.Scanner;
public class tugas3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nilai A ");
        int A=scanner.nextInt();
        System.out.print("Masukkan Nilai B ");
        int B=scanner.nextInt();
        int K;

        //
        if(A>0 && B<0){
            K=A*B;
           System.out.println(K);
        } else if(A<=0 && B<0){
            K=A+B;
            System.out.println(K);
        } else if(A<=0 && B>=0){
            K=A-B;
            System.out.println(K);
        } else {
            K=A/B;
            System.out.println(K);
         }
    }
}
