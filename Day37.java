import java.util.Scanner;
public class Day37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan sebuah angka");
        int angka = input.nextInt();
        if(angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap");
        } else {
            System.out.println(angka +"adalah bilangan ganjil.");
        }
    }
}
