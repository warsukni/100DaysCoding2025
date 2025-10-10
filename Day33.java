import java.util.Scanner;

public class Day33 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("apakah kamu sudah belajar hari ini? (true/false)");
        boolean belajar = input.nextBoolean();
        
        //operator logika NOT
        boolean hasil = !belajar;
        System.out.println("kamu belum belajar?" + hasil);
        
    }
}
