import java.util.Scanner;
public class Day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka");
        //input angka (int)
        int angka = sc.nextInt(); 
        //ubah ke String
        String strAngka = angka + "";
        System.out.println("angka dalam bentuk String: "+ strAngka);
        
    }
}
