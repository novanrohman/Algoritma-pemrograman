import java.util.*;

public class kerucut{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    float phi = 3.14f;
    float r, tinggi, s; //s = panjang garis pelukis
    float luasP, volume;

    System.out.println("\t Hitung Luas Permukaan dan Volume Kerucut \n\n");
    
    System.out.print(" Masukkan Jari-jari   :");
    r = scanner.nextFloat();

    System.out.print(" Masukkan Tinggi      : ");
    tinggi = scanner.nextFloat();

    System.out.print(" Masukkan Panjang Garis:");
    s = scanner.nextFloat();

  try {
    luasP = phi * r * (r+s);
    System.out.println("\n Luas Permukaannya  : " + luasP);

    volume = 1/(float)3 * phi * r * r * tinggi;
    System.out.println(" Volume Kerucutnya  : " + volume);

  } catch (Exception ex){
      // e.printStackTrace();
      System.out.println(ex);
    }
  }
}
