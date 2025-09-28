public class Day21 {
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        System.out.println("sebelum ditukar:");
        System.out.println("a = " + a + ",b = " + b);
        //proses tukar nilai
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("sesudah ditukar");
        System.out.println("a = " + a + ", b = " + b);
                
    }
}
