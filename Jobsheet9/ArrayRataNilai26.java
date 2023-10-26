import java.util.Scanner;

public class ArrayRataNilai26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input26.nextInt();

        int[] NilaiMhs = new int[jumlahMahasiswa];
        double Total = 0;
        double Rata2;
        int mahasiswaLulus = 0;

        for (int i = 0; i < NilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            NilaiMhs[i] = input26.nextInt();
            Total += NilaiMhs[i];
            if (NilaiMhs[i] > 70) {
                mahasiswaLulus++;
            }
        }

        Rata2 = Total / NilaiMhs.length;
        System.out.println("Rata-rata Nilai = " + Rata2);
        System.out.println("Jumlah Mahasiswa yang Lulus (>70) = " + mahasiswaLulus);
    }
}
