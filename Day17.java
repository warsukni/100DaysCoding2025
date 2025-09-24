import java.util.Scanner;
public class DAY17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka pertama:");
        int angka1 = input.nextInt();
        System.out.print("masukkan angka kedua");
        int angka2 = input.nextInt();
        
        int hasil = angka1 % angka2;
        int sisa  = angka1 % angka2;
        System.out.println("sisa bagi dari" + angka1 + " % " + angka2 + " = " + sisa);
        
    }
    
}
