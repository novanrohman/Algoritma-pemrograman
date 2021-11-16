import java.util.Scanner;
public class do_while {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); //scanner inputan

    int value;
    
    
    do { //menjalankan perintah di dalamnya
      value = input.nextInt();
      System.out.println(value);
    } while (value > 0); //ketika value lebih dari 0 maka program tidak berhenti
  }
}
