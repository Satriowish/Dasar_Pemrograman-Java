import java.util.Scanner;

public class Lingkaran26 {
    ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        double keliling, luas, phi;
        System.out.println("Masukan jari-jari lingkaran: ");
        r = sc.nextInt();
        phi = 3.14;
        keliling = 2 * phi * r;
        luas = phi * r * r;

        System.out.println("keliling = " + keliling);
        System.out.println("luas = " + luas);
    }
}
