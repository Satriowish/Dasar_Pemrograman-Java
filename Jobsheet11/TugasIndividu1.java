import java.util.Scanner;

public class TugasIndividu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = input.nextInt();
        input.close();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
        } else {
            for (int i = 1; i <= N; i++) {
                // Menambahkan spasi untuk pembentukan pola
                for (int k = 1; k <= N - i; k++) {
                    System.out.print(" ");
                }

                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
