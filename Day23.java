import java.util.Scanner;
public class Day23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan panjang");
        int panjang = input.nextInt();
        System.out.print("masukkan lebar");
        int lebar = input.nextInt();
        
       //menghitung luas
       int luas = panjang*lebar;
       
        System.out.println("luas  persegi panjang adalah : " + luas);
    }
    
}
