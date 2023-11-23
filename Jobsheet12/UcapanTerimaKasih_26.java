import java.util.Scanner;

public class UcapanTerimaKasih_26 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank You " + nama + " for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void UcapanTambahan(String ucapanTambahan) {
        System.out.println(ucapanTambahan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();

        // Menambahkan ucapan tambahan
        String ucapanTambahan = "Your guidance has been invaluable, and I am grateful for your unwavering support.";
        UcapanTambahan(ucapanTambahan);
    }
}
