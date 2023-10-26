<<<<<<< HEAD
import java.util.Scanner;

public class PemilihanPercobaan226 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.println("Nilai UAS    : ");
        float UAS = input26.nextFloat();
        System.out.println("Nilai UTS    : ");
        float UTS = input26.nextFloat();
        System.out.println("Nilai Kuis   : ");
        float Kuis = input26.nextFloat();
        System.out.println("Nilai Tugas  : ");
        float Tugas = input26.nextFloat();

        float total = (UAS * 0.4F) + (UTS * 0.3F) + (Kuis * 0.1F) + (Tugas * 0.2F);

        if (total > 80 && total <= 100) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : A ");
            System.out.println("Nilai Setara  : 4");
            System.out.println("Kualifikasi   : SANGAT BAIK ");
        } else if (total > 73 && total <= 80) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : B+ ");
            System.out.println("Nilai Setara  : 3.5 ");
            System.out.println("Kualifikasi   : LEBIH DARI BAIK ");
        } else if (total > 65 && total <= 73) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : B ");
            System.out.println("Nilai Setara  : 3 ");
            System.out.println("Kualifikasi   : BAIK ");
        } else if (total > 60 && total <= 65) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : C+ ");
            System.out.println("Nilai Setara  : 2.5 ");
            System.out.println("Kualifikasi   : LEBIH DARI CUKUP ");
        } else if (total > 50 && total <= 60) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : C ");
            System.out.println("Nilai Setara  : 2 ");
            System.out.println("Kualifikasi   : CUKUP ");
        } else if (total > 39 && total <= 50) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : D ");
            System.out.println("Nilai Setara  : 1 ");
            System.out.println("Kualifikasi   : KURANG ");
        } else if (total <= 39) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : E ");
            System.out.println("Nilai Setara  : 0 ");
            System.out.println("Kualifikasi   : GAGAL ");
        }
    }
=======
import java.util.Scanner;

public class PemilihanPercobaan226 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.println("Nilai UAS    : ");
        float UAS = input26.nextFloat();
        System.out.println("Nilai UTS    : ");
        float UTS = input26.nextFloat();
        System.out.println("Nilai Kuis   : ");
        float Kuis = input26.nextFloat();
        System.out.println("Nilai Tugas  : ");
        float Tugas = input26.nextFloat();

        float total = (UAS * 0.4F) + (UTS * 0.3F) + (Kuis * 0.1F) + (Tugas * 0.2F);

        if (total > 80 && total <= 100) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : A ");
            System.out.println("Nilai Setara  : 4");
            System.out.println("Kualifikasi   : SANGAT BAIK ");
        } else if (total > 73 && total <= 80) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : B+ ");
            System.out.println("Nilai Setara  : 3.5 ");
            System.out.println("Kualifikasi   : LEBIH DARI BAIK ");
        } else if (total > 65 && total <= 73) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : B ");
            System.out.println("Nilai Setara  : 3 ");
            System.out.println("Kualifikasi   : BAIK ");
        } else if (total > 60 && total <= 65) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : C+ ");
            System.out.println("Nilai Setara  : 2.5 ");
            System.out.println("Kualifikasi   : LEBIH DARI CUKUP ");
        } else if (total > 50 && total <= 60) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : C ");
            System.out.println("Nilai Setara  : 2 ");
            System.out.println("Kualifikasi   : CUKUP ");
        } else if (total > 39 && total <= 50) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : D ");
            System.out.println("Nilai Setara  : 1 ");
            System.out.println("Kualifikasi   : KURANG ");
        } else if (total <= 39) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : E ");
            System.out.println("Nilai Setara  : 0 ");
            System.out.println("Kualifikasi   : GAGAL ");
        }
    }
>>>>>>> 6233f81f7c42ffd94239b580c1b97f6885a03735
}