import java.util.Scanner;

public class Kubus_26 {
    // Fungsi untuk menghitung volume kubus
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    // Fungsi untuk menghitung luas permukaan kubus
    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    // Fungsi Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s, LP, Vol;

        System.out.print("Masukkan panjang sisi :");
        s = input.nextInt();

        LP = hitungLuasPermukaan(s);
        System.out.println("Luas Persegi adalah :" + LP);

        Vol = hitungVolume(s);
        System.out.println("Volume Kubus adalah :" + Vol);

    }
}
