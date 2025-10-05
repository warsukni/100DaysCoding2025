package belajarcoding;
import java.util.Scanner;
public class BelajarCoding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("PIN1 : ");
        int a = in.nextInt();
        System.out.print("PIN2 : ");
        int b = in.nextInt();
        System.out.println("anu "+(a==b));
        System.out.println("anu "+(a!=b));
    }
}
