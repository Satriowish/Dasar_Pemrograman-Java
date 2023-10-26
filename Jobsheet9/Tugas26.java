import java.util.Scanner;

public class Tugas26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.print("Masukkan banyaknya Nilai : ");
        int n = input26.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan Nilai ke-" + (i + 1) + ": ");
            arr[i] = input26.nextInt();
        }

        // Nilai tertinggi, terendah, dan rata-rata
        int nilaiTertinggi = arr[0];
        int nilaiTerendah = arr[0];
        int total = arr[0];

        // Menghitung nilai tertinggi, terendah, dan total
        for (int i = 1; i < n; i++) {
            if (arr[i] > nilaiTertinggi) {
                nilaiTertinggi = arr[i];
            }
            if (arr[i] < nilaiTerendah) {
                nilaiTerendah = arr[i];
            }
            total += arr[i];
        }

        double rataRata = (double) total / n;

        System.out.println("Nilai Tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai Terendah  : " + nilaiTerendah);
        System.out.println("Nilai Rata-Rata : " + rataRata);

    }
}
