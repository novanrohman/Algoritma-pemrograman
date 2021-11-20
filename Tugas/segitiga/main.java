import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    System.out.println("Program untuk menentukan jenis segitiga");
    String namaFile = "src/sisi.txt";

    try (Scanner in = new Scanner(new FileReader(namaFile))) {
      System.out.println("A B C Tinggi Jenis Segitiga");
      while (in.hasNext()) { //cek apakah ada baris berikutnya
        String line = in.nextLine(); //membaca baris dalam file
        String[] column = line.split(";"); //memisahkan kolom

        int A = Integer.parseInt(column[0]);
        int B = Integer.parseInt(column[1]);
        int C = Integer.parseInt(column[2]);
        int t = Integer.parseInt(column[3]);
        int sisi_2 = 0;
        int sisi = 0;
        int panjang = 0;

        //Cek sisi terpanjang
        if (A > B && A > C) {
          panjang = A * A; //meangkatkan sisi terpanjang
          sisi = B + C; //menjumlahkan 2 sisi
          sisi_2 = sisi * sisi; //memangkatkan 2 sisi
          
          //menentukan bentuk
          if(panjang > sisi_2 + t){
              System.out.println(A + " " + B + " " + C + " " + t + " Tumpul");
          }else if(panjang <= sisi_2 + t && panjang >= sisi_2 -t){
              System.out.println(A + " " + B + " " + C + " " + t + " Siku-siku");
          }
          else if(panjang < sisi_2 - t){
              System.out.println(A + " " + B + " " + C + " " + t + " Lancip");
          }

        } else if (B > A && B > C) {
          panjang = B * B; //meangkatkan sisi terpanjang
          sisi = A + C; //menjumlahkan 2 sisi
          sisi_2 = sisi * sisi; //memangkatkan 2 sisi

          //menentukan bentuk
          if(panjang > sisi_2 + t){
              System.out.println(A + " " + B + " " + C + " " + t + " Tumpul");
          }else if(panjang <= sisi_2 + t && panjang >= sisi_2 - t){
              System.out.println(A + " " + B + " " + C + " " + t + " Siku-siku");
          }else if(panjang < sisi_2 - t){
              System.out.println(A + " " + B + " " + C + " " + t + " Lancip");
          }
          
        } else {
          panjang = C * C; //meangkatkan sisi terpanjang
          sisi = B + A; //menjumlahkan 2 sisi
          sisi_2 = sisi * sisi; //memangkatkan 2 sisi

          //menentukan bentuk
          if(panjang > sisi_2 + t){
              System.out.println(A + " " + B + " " + C + " " + t + " Tumpul");
          }else if(panjang <= sisi_2 + t && panjang >= sisi_2 - t){
              System.out.println(A + " " + B + " " + C + " " + t + " Siku-siku");
          }else if(panjang < sisi_2 - t){
              System.out.println(A + " " + B + " " + C + " " + t + " Lancip");
          }
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace(); //aksi ketika file tidak ditemukan
    }
  }
}
