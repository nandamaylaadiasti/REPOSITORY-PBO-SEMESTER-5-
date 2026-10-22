package unguided;

public class Main {
    public static void main(String[] args) {
        // Membuat array bertipe kelas induk yang berisi 3 objek turunan
        ModelML[] daftarModel = new ModelML[3];
        daftarModel[0] = new ModelRegresi("Regresi Linier", 500, 4);
        daftarModel[1] = new ModelKlasifikasi("Decision Tree", 800, 3);
        daftarModel[2] = new ModelDeepLearning("Neural Network", 1000, 5, 3);

        int totalBiaya = 0;

        // Perulangan untuk menampilkan informasi, biaya komputasi, dan menjumlahkan total biaya
        for (ModelML model : daftarModel) {
            model.tampilkanInformasi();
            int biaya = model.hitungBiaya(); // Memanggil method hitungBiaya() tanpa parameter
            System.out.println("Biaya komputasi: " + biaya);
            totalBiaya += biaya;
        }

        System.out.println("Total biaya: " + totalBiaya + ".");

        // Menampilkan pengujian method dengan parameter khusus
        // 1. Biaya 10 epoch untuk model "Neural Network" (indeks ke-2)
        System.out.println("Biaya 10 epoch (Neural Network): " + daftarModel[2].hitungBiaya(10));

        // 2. Biaya 10 epoch untuk model "Regresi Linier" (indeks ke-0)
        System.out.println("Biaya 10 epoch (Regresi Linier): " + daftarModel[0].hitungBiaya(10));

        // 3. Biaya 10 epoch dengan ukuran batch 50 untuk model "Regresi Linier"
        ModelRegresi regresi = (ModelRegresi) daftarModel[0];
        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): " + regresi.hitungBiaya(10, 50));
    }
}