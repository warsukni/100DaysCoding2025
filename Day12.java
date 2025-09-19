import java.util.Scanner;
public class warsukni {
    public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
        System.out.println("INPUT BIODATA MAHASISWA");
        System.out.println("");
        System.out.print("Masukkan nama anda : ");
        final String nama = in.nextLine();
        System.out.print("Masukkan NIM anda  : ");
        String Nim = in.nextLine();
        System.out.print("Masukkan umur anda : ");
        int umur = in.nextInt();
        System.out.print("Gender anda\t   : ");
        char JK = in.next().charAt(0);
        in.nextLine();
        System.out.print("Masukkan hobi\t   : ");
        String hobi = in.nextLine();
        System.out.println("");
        System.out.print("==> OUTPUT BIODATA MAHASISWA <==\n");
        System.out.println("Nama\t\t: "+nama);
        System.out.println("Hobi\t\t: "+Nim);
        System.out.print("Umur\t\t: "+umur);
        System.out.print("\nJenis kelamin\t: "+JK);
        System.out.println("\nHobi saya \t: "+hobi);
        
    }
}
