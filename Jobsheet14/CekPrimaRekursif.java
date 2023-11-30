import java.util.Scanner;

public class CekPrimaRekursif {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan : ");
        int n = scanner.nextInt();

        if (prima(n, 2)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }

        scanner.close();
    }

    private static boolean prima(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }

        return prima(n, i + 1);
    }
}
