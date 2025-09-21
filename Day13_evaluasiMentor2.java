public class evaluasi2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nama :");
        String nama = in.next();
        System.out.print("masukkan umur");
        int umur = in.nextInt();
        System.out.print("masukkan nim");
        String nim = in.next();
        System.out.print("masukkan tinggi");
        double tinggi = in.nextDouble();
        System.out.print("masukkan status");
        boolean status = in.nextBoolean();
        in.nextLine();
        System.out.print("masukkan alamat");
        String alamat = in.nextLine();
        
        System.out.print("===============BIODATA===============\n");
        System.out.print("\nnama\t\t :\t"+nama);
        System.out.print("\numur\t\t : \t"+umur);
        System.out.print("\nnim\t\t : \t"+nim);
        System.out.print("\ntinggi\t\t : \t"+tinggi);
        System.out.print("\nstatus\t\t : \t"+status);
        System.out.print("\nalamat\t\t : \t"+alamat);
        System.out.print("\n===================================\n");
        
        
    }
}
