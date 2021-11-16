public class perulanganBersarang{
    public static void main (String[] args){
        for(int i = 1; i < 10; i++){ //mengulang i sebanyak sembilan kali
            for (int j = 1; j < 10; j++ ){ //mengulang j sebanyak sembilan kali
                System.out.print(i*j + "\t"); //mengalikan nilai i dengan j dan mencetak hasilnya
            }
            System.out.println();
        }
    }
}