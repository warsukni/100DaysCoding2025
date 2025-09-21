public class warsukniday14 {
    public static void main(String[] args) {
        //Data dalam bentuk String
        String strUmur = "18";
        String strTinggi = "149.0";
        
        // Konversi ke tipe data primitif
        int umur = Integer.parseInt(strUmur);
        double tinggi = Double.parseDouble(strTinggi);
        
        // Output Biodata
        System.out.println("Umur            : " + umur + " tahun");
        System.out.println("Tinggi Badan    : " + tinggi + " cm");
        
    }
}
