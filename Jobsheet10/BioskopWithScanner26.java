import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        int baris = 0;
        int kolom = 0;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu 1-3 : ");

            int Pilihan = input26.nextInt();
            input26.nextLine();

            switch (Pilihan) {
                case 1:
                    System.out.print("Masukkan Nama  : ");
                    nama = input26.nextLine();
                    System.out.print("Masukkan Baris : ");
                    baris = input26.nextInt();
                    System.out.print("Masukkan Kolom : ");
                    kolom = input26.nextInt();
                    input26.nextLine();
                    penonton[baris - 1][kolom - 1] = nama;

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil dimasukkan ");
                    } else {
                        System.out.println("Nomor baris atau kolom kursi tidak tersedia!");
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Program  Telah selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai");
            }
            System.out.print("Lanjutkan (y/n) : ");
            next = input26.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
