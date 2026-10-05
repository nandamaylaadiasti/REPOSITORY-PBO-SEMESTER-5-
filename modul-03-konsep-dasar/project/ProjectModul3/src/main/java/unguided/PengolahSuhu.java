package unguided;

public class PengolahSuhu {
     // Instance field
    // Setiap object PengolahSuhu memiliki array suhu masing-masing.
    private double[] suhuHarian;

    // Class field
    // Nilainya sama untuk semua object dan tidak dapat diubah.
    private static final double NILAI_KOSONG = -1.0;

    // Constructor
    // Nama parameter sama dengan nama field, sehingga menggunakan this.
    public PengolahSuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian;
    }

    // Menampilkan seluruh data suhu.
    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {

            System.out.print("Hari " + (i + 1) + " : ");

            if (suhuHarian[i] == NILAI_KOSONG) {
                System.out.println("(kosong)");
            } else {
                System.out.printf("%.1f°C%n", suhuHarian[i]);
            }
        }
    }

    // Mencari index yang berisi nilai kosong.
    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {

            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }

        // Jika tidak ada data kosong.
        return -1;
    }

    // Mengisi data yang kosong menggunakan rata-rata
    // suhu satu hari sebelum dan satu hari sesudahnya.
    public void isiDataKosong() {

        int indexKosong = cariIndexKosong();

        if (indexKosong != -1) {

            suhuHarian[indexKosong] =
                    (suhuHarian[indexKosong - 1]
                    + suhuHarian[indexKosong + 1]) / 2;
        }
    }

    // Menghitung rata-rata suhu setelah data bersih.
    public double hitungRataRata() {

        double total = 0;

        for (double suhu : suhuHarian) {
            total += suhu;
        }

        return total / suhuHarian.length;
    }
}
