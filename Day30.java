import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan angka pertama"); 
        int u = input.nextInt();
        System.out.print("masukkan angka kedua");
        int e = input.nextInt();
        System.out.println("u >= e : " + ( u >= e));
        System.out.println("u <= e : " + ( u <= e));
        
    }
}
