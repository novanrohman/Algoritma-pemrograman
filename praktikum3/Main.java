public class Main{
    public static void main (String[] args){
        double jumlah=200000;
        double discount = 100-5;
        double total;

        if(jumlah >= 100000){
                total=(discount*jumlah)/100;
                System.out.println("diskon ="+discount+"%");
                System.out.println("Total setelah diskon= "+total);
            }
            else{
                System.out.println("Discount 0");
                System.out.println("Total"+jumlah);
            }
        }
    }
