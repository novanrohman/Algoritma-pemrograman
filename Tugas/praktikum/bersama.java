import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class bersama {

  public static void main(String[] args) {
    System.out.println("Program untuk menghitung hasil kuadrat");
    String namaFile = "src/kuadrat.txt";
    try (Scanner in = new Scanner(new FileReader(namaFile))) {
      System.out.println("Angka   Kuadrat");
      while (in.hasNext()) { //cek apakah ada baris berikutnya
        String line = in.nextLine(); //membaca baris dalam file
        String[] column = line.split(";"); //memisahkan kolom
        
        int num = Integer.parseInt(column[0]);
        int kuadrat=0;
        kuadrat = num * num;
        System.out.println(num + " " + kuadrat);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace(); //aksi ketika file tidak ditemukan
    }
  }
}
