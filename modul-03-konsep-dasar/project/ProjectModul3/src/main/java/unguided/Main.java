package unguided;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // 1. Menyiapkan array suhu 7 hari.
        double[] suhuHarian = {
            30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9
        };

        // 2. Membuat object PengolahSuhu.
        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        // Menampilkan data awal.
        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();

        // Mencari index data yang kosong.
        int indexKosong = pengolah.cariIndexKosong();

        System.out.println();
        System.out.println(
            "Index hari kosong (dimulai dari 0): " + indexKosong
        );

        // 3. Mengisi data yang kosong.
        pengolah.isiDataKosong();

        // 4. Menampilkan data setelah pengisian.
        System.out.println();
        System.out.println("=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();

        // Menampilkan rata-rata suhu.
        System.out.printf(
            "%nRata-rata : %.2f°C%n",
            pengolah.hitungRataRata()
        );

        // 5. Menampilkan kembali array suhuHarian yang ada di main.
        System.out.println();
        System.out.println(
            "Isi array suhuHarian di main setelah "
            + "isiDataKosong() dijalankan:"
        );

        System.out.println(Arrays.toString(suhuHarian));

        /*
         * Penjelasan:
         * Array suhuHarian yang ada di main ikut berubah karena
         * constructor PengolahSuhu menyimpan reference/referensi
         * ke array yang sama, bukan membuat salinan array baru.
         *
         * Ketika method isiDataKosong() mengubah isi array melalui
         * object pengolah, perubahan tersebut sebenarnya dilakukan
         * pada array yang sama dengan array suhuHarian di main.
         *
         * Oleh karena itu, setelah isiDataKosong() dijalankan,
         * nilai pada array suhuHarian di main juga ikut berubah.
         */
        System.out.println(
            "(ikut berubah: constructor menyimpan referensi array yang sama)"
        );
    }
}


