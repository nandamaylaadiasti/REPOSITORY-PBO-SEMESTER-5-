package unguided;

public class ModelML {
    private String namaModel;
    private int jumlahDataLatih;

    // Constructor
    public ModelML(String namaModel, int jumlahDataLatih) {
        this.namaModel = namaModel;
        this.jumlahDataLatih = jumlahDataLatih;
    }

    // Getter untuk membaca jumlah data latih
    public int getJumlahDataLatih() {
        return jumlahDataLatih;
    }

    // Getter untuk membaca nama model
    public String getNamaModel() {
        return namaModel;
    }

    // Method untuk menampilkan informasi
    public void tampilkanInformasi() {
        System.out.println("Model: " + namaModel + " | Data latih: " + jumlahDataLatih);
    }

    // Method menghitung biaya komputasi 1 (Tanpa parameter)
    public int hitungBiaya() {
        return jumlahDataLatih * 2;
    }

    // Method menghitung biaya komputasi 2 (Overloading dengan 1 parameter: epoch)
    public int hitungBiaya(int epoch) {
        return jumlahDataLatih * epoch;
    }
}