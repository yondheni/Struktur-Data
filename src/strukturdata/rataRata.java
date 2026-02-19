public class rataRata {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }

        double rata = (double) total / angka.length;

        System.out.println("Tambah : " + total);
        System.out.println("Rata-rata : " + rata);
    }
}