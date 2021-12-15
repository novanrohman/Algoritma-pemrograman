public class Fibonacci{
    public static void main (String[] args){
        int n = 10;
        for (int i=0;i<n;i++){
            System.out.println("f" + i + "=" + fibbon(i));
        }
    }

    public static int fibbon(int x){
        if(x<=1) {
            return x;
        }
        return fibbon (x - 1) + fibbon(x - 2);
    }
}