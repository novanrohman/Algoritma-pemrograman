//Ngobar kalkulator
import java.lang.Math;
import java.util.Scanner;
import java.util.*;

public class Main{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Program Kalkulator Sederhana");
    System.out.println();
    System.out.println("Pilih");
    System.out.println("1. Penjumlahan 2. Pengurangan");
    System.out.println("3. Perkalian  4. Pembagian");
    System.out.println("5. Sisa bagi");    
    int choice = input.nextInt();

    switch (choice){
      case 1:
      penjumlahan(); break;
      case 2:
      pengurangan(); break;
      case 3:
      perkalian(); break;
      case 4:
      pembagian(); break;
      case 5:
      sisa_bagi(); break;
    } 
  }

    public static void penjumlahan(){
      Scanner math1 = new Scanner(System.in);
      double a, b, c;

      System.out.println("Masukkan Angka pertama: ");
      a = math1.nextInt();
      System.out.println("Masukkan Angka kedua: ");
      b = math1.nextInt();
      c = a+b;
      System.out.println("Hasil =" + c);
      }

    public static void pengurangan(){
      Scanner math1 = new Scanner(System.in);
      double a, b, c;
      System.out.println("Masukkan Angka Pertama: ");
      a = math1.nextInt();
      System.out.println("Masukkan Angka Kedua: ");
      b = math1.nextInt();
      c = a-b;
      System.out.println("Hasil : " + c);
      }

   public static void perkalian(){
      Scanner math1 = new Scanner(System.in);
      double a, b, c;

      System.out.println("Masukkan Angka Pertama: ");
      a = math1.nextInt();
      System.out.println("Masukkan Angka Kedua: ");
      b = math1.nextInt();
      c = a*b;
      System.out.println("Hasil : " + c);
      }

    public static void pembagian(){
      Scanner math1 = new Scanner(System.in);
      double a, b, c;
      
      System.out.println("Masukkan Angka Pertama: ");
      a = math1.nextInt();
      System.out.println("Masukkan Angka Kedua");
      b = math1.nextInt();
      c = a / b;
      System.out.println("Hasil : " + c);
      }

    public static void sisa_bagi(){
      Scanner math1 = new Scanner(System.in);
      double a, b, c;

      System.out.println("Masukkan Angka Pertama");
      a = math1.nextInt();
      System.out.println("Masukkan Angka Kedua");
      b = math1.nextInt();
      c = a % b;
      System.out.println("Hasil : " + c);
      }
}