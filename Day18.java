import java.util.Scanner;
public class Day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan angka (byte): ");
        byte x = sc.nextByte();      // tipe data kecil
        double y = x;                // otomatis kebesar
        
        System.out.println("nilai awal (byte):" + x);
        System.out.println("stelah konversi (double):" +y);
        
        sc.close();
    }
}
