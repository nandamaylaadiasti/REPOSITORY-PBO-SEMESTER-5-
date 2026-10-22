package unguided;

public class ModelDeepLearning extends ModelKlasifikasi {
    private int jumlahLayer;

    // Constructor
    public ModelDeepLearning(String namaModel, int jumlahDataLatih, int jumlahKelas, int jumlahLayer) {
        super(namaModel, jumlahDataLatih, jumlahKelas);
        this.jumlahLayer = jumlahLayer;
    }

    public int getJumlahLayer() {
        return jumlahLayer;
    }

    // Override tampilkan informasi dari kelas di atasnya
    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Jumlah layer: " + jumlahLayer);
    }

    // Override hitung biaya tanpa parameter: biaya = (biaya versi kelas di atasnya) + (jumlah layer x 200)
    @Override
    public int hitungBiaya() {
        return super.hitungBiaya() + (jumlahLayer * 200);
    }
}