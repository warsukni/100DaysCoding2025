import java.util.Scanner;
public class Day36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan IPK : ");
        double ipk = input.nextDouble();
        System.out.print("masukkan penghasilan orang tua (juta) ");
        double penghasilan = input.nextDouble();
        
        if (ipk >= 3.5) {
            if (penghasilan < 5) {
                System.out.println("kamu berhak mendapatkan beasiswa!");
            } else {
                System.out.println("kamu tidak berhak,penghasilan orang tua terlalu tinggi.");
            }
        } else {
            System.out.println("kamu tidak berhak karena IPK belum memenuhi syarat.");
        }
    }
}
