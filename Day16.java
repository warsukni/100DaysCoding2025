import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        byte no1 = in.nextByte();
        System.out.print("Masukkan angka: ");
        byte no2 = in.nextByte();
        System.out.println();
        System.out.println("Nilai perkalian = "+(no1*no2));
        System.out.println("Nilai pembagian = "+(no1/no2));
    }
    
}
