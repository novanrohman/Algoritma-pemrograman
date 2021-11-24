import java.util.Scanner;

public class enam {
    public static void main(String[] args) {
        // sisipkan kode di sini
        panggilAkuHebat();
        
    }
    public static void panggilAkuHebat() {
        System.out.println("Ketikkan namamu");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name + ", kamu hebat!");
    }
}