<<<<<<< HEAD
import java.util.Scanner;

public class PemilihanPercobaan3 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("Masukan angka pertama       : ");
        angka1 = input26.nextDouble();
        System.out.println("Masukan angka kedua         : ");
        angka2 = input26.nextDouble();
        System.out.println("Masukan operator (+ - * / ) : ");
        operator = input26.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + '+' + angka2 + "=" + hasil);

            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + '-' + angka2 + "=" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + '*' + angka2 + "=" + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + '-' + angka2 + "=" + hasil);
                break;

        }

    }
}
=======
import java.util.Scanner;

public class PemilihanPercobaan3 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("Masukan angka pertama       : ");
        angka1 = input26.nextDouble();
        System.out.println("Masukan angka kedua         : ");
        angka2 = input26.nextDouble();
        System.out.println("Masukan operator (+ - * / ) : ");
        operator = input26.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + '+' + angka2 + "=" + hasil);

            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + '-' + angka2 + "=" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + '*' + angka2 + "=" + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + '-' + angka2 + "=" + hasil);
                break;

        }

    }
}
>>>>>>> 6233f81f7c42ffd94239b580c1b97f6885a03735
