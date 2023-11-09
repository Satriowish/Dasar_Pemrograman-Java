import java.util.Scanner;;

public class Star {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = input26.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("*");
        }
    }
}