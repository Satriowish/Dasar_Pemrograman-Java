import java.util.Scanner;

public class HargaBayar26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah, jmlHalBuku;
        double disc, total, bayar, jmlDis;
        String MerkBuku;
        System.out.println("Masukan Merk Buku yang yang dibeli ");
        MerkBuku = input.nextLine();
        System.out.println("Masukan jumlah Halaman Buku ");
        jmlHalBuku = input.nextInt();
        System.out.println("Masukan Harga barang yang dibeli ");
        harga = input.nextInt();
        System.out.println("Masukan Jumlah Barang Yang Dibeli ");
        jumlah = input.nextInt();
        System.out.println("Masukan Jumlah Diskon ");
        disc = input.nextInt();
        total = harga * jumlah;
        jmlDis = total * disc / 100;
        bayar = total - jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);

    }
}