import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.print("Masukkan Nama  : ");
            nama = input26.nextLine();
            System.out.print("Masukkan Baris : ");
            baris = input26.nextInt();
            System.out.print("Masukkan Kolom : ");
            kolom = input26.nextInt();
            input26.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n) : ");
            next = input26.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
