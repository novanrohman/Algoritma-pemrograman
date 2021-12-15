public class kombinasiKarakter{
    public static void CharCombination(String a, int n) {
        if (n == 0) {
            System.out.print(a + " ");
        } else {
            for (int i = 97; i < 100; i++) {
                CharCombination(a + (char ) i, n - 1);
            }
        }
    }
    public static void main(String[] args){
        CharCombination(" ",3);
    }
}