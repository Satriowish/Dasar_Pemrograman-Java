import java.util.Scanner;

public class ArrayNilai26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        int[] nilaiakhir = new int[10];

        for (int i = 0; i < nilaiakhir.length; i++) {
            System.out.print("Masukkan Nilai Akhir Ke-" + i + " : ");
            nilaiakhir[i] = input26.nextInt();
        }

        System.out.println("Status Kelulusan Mahasiswa:");
        for (int i = 0; i < nilaiakhir.length; i++) {
            if (nilaiakhir[i] > 70) {
                System.out.println("Mahasiswa Ke-" + i + " LULUS!");
            } else {
                System.out.println("Mahasiswa Ke-" + i + " TIDAK LULUS!");
            }
        }
    }
}
