public class PorseniPolinema2024 {
    public static void main(String[] args) {
        // Membuat array dua dimensi untuk data atlet (nama, cabang olahraga)
        String[][] dataAtlet = {
                { "Samsul", "Badminton" },
                { "Fajar", "Badminton" },
                { "Bayu", "Badminton" },
                { "Gandud", "Badminton" },
                { "Yatno", "Badminton" },
                { "Bagus", "Tenis Meja" },
                { "Gatot", "Tenis Meja" },
                { "Yudi", "Tenis Meja" },
                { "Arynto", "Tenis Meja" },
                { "Jarno", "Tenis Meja" },
                { "Kumal", "Basket" },
                { "Akmal", "Basket" },
                { "Tengik", "Basket" },
                { "Mambu", "Basket" },
                { "Anhar", "Basket" },
                { "Dilan", "Bola Voly" },
                { "Akeo", "Bola Voly" },
                { "Elzan", "Bola Voly" },
                { "Delon", "Bola Voly" },
                { "Alex", "Bola Voly" }
        };

        // Mengurutkan data atlet berdasarkan nama atlet (kolom 0)
        for (int i = 0; i < dataAtlet.length - 1; i++) {
            for (int j = 0; j < dataAtlet.length - i - 1; j++) {
                if (dataAtlet[j][0].compareTo(dataAtlet[j + 1][0]) > 0) {
                    // Swap jika nama atlet sekarang lebih besar dari nama atlet berikutnya
                    String[] temp = dataAtlet[j];
                    dataAtlet[j] = dataAtlet[j + 1];
                    dataAtlet[j + 1] = temp;
                }
            }
        }

        // Menampilkan informasi nama atlet dan cabang olahraga
        System.out.println("\nInformasi Atlet Porseni 2024:");
        for (String[] atlet : dataAtlet) {
            System.out.println("Nama: " + atlet[0] + ", Cabang: " + atlet[1]);
        }
    }
}
