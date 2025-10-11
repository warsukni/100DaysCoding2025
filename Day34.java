import java.util.Scanner;
public class Day34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan umur");
        int umur =input.nextInt();
        System.out.print("apakah kamu punya sim? (true/false) ");
        boolean punyaSIM = input.hasNextBoolean();
        
        boolean bolehMengemudi = (umur >= 17 && punyaSIM) || !(umur < 15);
        System.out.println("boleh mengemudi?" + bolehMengemudi);
    }
}
