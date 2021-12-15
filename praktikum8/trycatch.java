public class trycatch {
  public static void main (String[] args) {
    try {
      double d = 2 / 0;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Something goes wrong");
    }
  }
}