public class BubbleSortExample26 {
    public static void main(String[] args) {
        int[] intData = { 13, 18, 87, 72, 32, 54, 43 };
        int temp = 0;

        for (int i = 0; i < intData.length; i++) {
            for (int j = 1; j < intData.length; j++) {
                // Mengubah tanda '>' menjadi '<' Untuk Pengurutan mengecil (descending)
                if (intData[j - 1] < intData[j]) {

                    temp = intData[j];
                    intData[j] = intData[j - 1];
                    intData[j - 1] = temp;
                }
            }
        }
        System.out.println("Hasil Pengurutan (Descending): ");
        for (int i = 0; i < intData.length; i++) {
            System.out.println(intData[i]);
        }
    }
}
