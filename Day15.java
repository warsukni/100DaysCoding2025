import java.util.Scanner;
public class Warsukn1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        short no1 = in.nextShort();
        System.out.print("Masukkan angka: ");
        short no2 = in.nextShort();
        System.out.println();
        System.out.println("Nilai penjumlahan = "+(no1+no2));
        System.out.println("Nilai pengurangan = "+(no1-no2));
        
    }
}
