import java.util.Scanner;
public class Day19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("masukkan angka (double):");
        //input tipe data besar (double)
        double un = sc.nextDouble();
        
        //konversi manual ke kecil
        byte ni = (byte) un;
        
        System.out.println("nilai awal (double):"+un);
        System.out.println("setelah konversi (byte):"+ni);
        
        sc.close();
        
    }
 
}
