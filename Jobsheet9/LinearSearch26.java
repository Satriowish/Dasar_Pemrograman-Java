import java.util.Scanner;

public class LinearSearch26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int key = 0;
        int hasil = 0, jml, status = 1;
        System.out.print("Masukkan jumlah elemen array : ");
        jml = input.nextInt();
        int[] arrayInt = new int[jml];
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + " : ");
            arrayInt[i] = input.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari : ");
        key = input.nextInt();
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key && key == 0) {
                System.out.println("Masukkan key yang ingin dicari : 0");
                status = -1;
                System.exit(status);
            }
            break;
        }

    }
}