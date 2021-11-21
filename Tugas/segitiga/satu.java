import java.util.Scanner;
 
 /*
  sisi_tp = sisi terpanjang
  sisi_ln = sisi
 */

 class satu {
    public static void main(String args[]) {
        System.out.println("Program untuk menentukan jenis segitiga");
        forLoop();
      }
    public static void forLoop(){
        for (int i = 1; i <= 10; i++) {
            int a, b, c, t;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("=============================");
            System.out.println("Data ke " + i);
            System.out.print("Sisi A : ");
            a = keyboard.nextInt(); 
            System.out.print("Sisi B : ");
            b = keyboard.nextInt();
            System.out.print("Sisi C : ");
            c = keyboard.nextInt();
            System.out.print("TINGGI : ");
            t = keyboard.nextInt();
 
            int sisi_tp, sisi_ln1, sisi_ln2;
            if (a>b && a>c){
                sisi_tp = a;
                sisi_ln1 = b;
                sisi_ln2 = c;
            } else if (b>a && b>c){
                sisi_tp = b;
                sisi_ln1 = a;
                sisi_ln2 = c;
            } else {
                sisi_tp = c;
                sisi_ln1 = a;
                sisi_ln2 = b;
            }
 
            if (Math.pow(sisi_tp,2) > Math.pow(sisi_ln1,2) + Math.pow(sisi_ln2,2) + t){
                System.out.println("JENIS SEGITIGA : TUMPUL");
            } else if (Math.pow(sisi_tp,2) < Math.pow(sisi_ln1,2) + Math.pow(sisi_ln2,2) - t){
                System.out.println("JENIS SEGITIGA : LANCIP");
            } else {
                System.out.println("JENIS SEGITIGA : SIKU - SIKU ");
            }
        }
    }    
 
}