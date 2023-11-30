import java.util.Scanner;

public class CekPrimaRekrusif {

    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        System.out.print("Masukkan nilai  : ");
        int n = input26.nextInt();

        if (cetakPrimaRekursif(n, 2)) {
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " bukan bilangan prima");
        }
        input26.close();
    }

    public static boolean cetakPrimaRekursif(int n, int pembagi) {
        if (n <= 1) {
            return false;
        } else if (n % pembagi == 0) {
            return false;
        } else {
            return cetakPrimaRekursif(n, pembagi + 1);
        }
    }
}
