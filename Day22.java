import java.util.Scanner;
public class Day22 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan panjang persegi: ");
        int sisi = input.nextInt();
        //rumus luas persegi
        int luas = sisi * sisi;
        System.out.println("luas persegi adalah " + luas);
    }
 
}
