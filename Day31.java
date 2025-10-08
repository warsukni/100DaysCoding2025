import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("masukkan umur :");
        int umur = in.nextInt();
        System.out.print("apakah punya KTP? (true/false):");
        boolean punyaKTP = in.hasNextBoolean();
        if (umur >= 17 && punyaKTP) {
            System.out.println("boleh masuk.");
        }else{
            System.out.println("tidak boleh masuk.");
            
        }
    }
}
