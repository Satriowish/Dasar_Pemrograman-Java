import java.util.Scanner;

public class Gaji26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji = 40000, potGaji = 25000;
        System.out.println("Masukan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukan Jumlah Hari Tidak Masuk Kerja Anda");
        JmlTdkMasuk = input.nextInt();
        TotGaji = (jmlMasuk * gaji) - (JmlTdkMasuk * potGaji);
        System.out.println("Gaji yang anda terima adalah " + TotGaji);

    }
}