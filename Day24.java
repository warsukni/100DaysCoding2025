import java.util.Scanner;
public class Day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("masukkan jari-jari lingkaran: ");
        double r = sc.nextDouble();
        double luas = Math.PI * r * r;
        System.out.println("luas lingkaran dengan jari-jari " + r +"adalah: " + luas);
    }
}
