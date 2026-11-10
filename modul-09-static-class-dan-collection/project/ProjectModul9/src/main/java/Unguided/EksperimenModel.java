package Unguided;

import java.util.Comparator;

public class EksperimenModel implements Comparable<EksperimenModel> {
    private String namaModel;
    private double akurasi;
    private int waktuTraining; // dalam detik (ditambahkan tipe data int)
    
    // Static variable untuk menghitung jumlah eksperimen yang dibuat
    private static int jumlahEksperimen = 0;

    public EksperimenModel(String namaModel, double akurasi, int waktuTraining) {
        this.namaModel = namaModel;
        this.akurasi = akurasi;
        this.waktuTraining = waktuTraining;
        jumlahEksperimen++; // bertambah setiap objek baru dibuat
    }

    public String getNamaModel() {
        return namaModel;
    }

    public double getAkurasi() {
        return akurasi;
    }

    public int getWaktuTraining() {
        return waktuTraining;
    }

    // Static method untuk mengambil nilai jumlah eksperimen
    public static int getJumlahEksperimen() {
        return jumlahEksperimen;
    }

    @Override
    public String toString() {
        return "Model=" + namaModel + ", akurasi=" + akurasi + ", waktu=" + waktuTraining + " detik";
    }

    // Implementasi Comparable: Mengurutkan berdasarkan akurasi dari tertinggi ke terendah (Descending)
    @Override
    public int compareTo(EksperimenModel o) {
        return Double.compare(o.akurasi, this.akurasi);
    }
}
