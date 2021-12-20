public class towerOfHanoi {
  static void tower(int n,char from_rod,char to_rod,char helper_rod)
  {
    if (n == 1){
      System.out.println("pindahkan disc 1 dari pasak  " + from_rod + " ke pasak " + to_rod);
      return;
    }
    tower(n-1,from_rod,helper_rod,to_rod);
    System.out.println("pindahkan disc " + n + " dari pasak " + from_rod + " ke pasak " + to_rod);
    tower(n-1,helper_rod,to_rod,from_rod);
  }

  public static void main(String args[]){
    int n = 5;
    tower(n, 'A','C','B');
  }
}
