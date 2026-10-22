package unguided;

public class ModelRegresi extends ModelML {
    private int jumlahFitur;

    // Constructor
    public ModelRegresi(String namaModel, int jumlahDataLatih, int jumlahFitur) {
        super(namaModel, jumlahDataLatih);
        this.jumlahFitur = jumlahFitur;
    }

    public int getJumlahFitur() {
        return jumlahFitur;
    }

    // Override tampilkan informasi
    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Jumlah fitur: " + jumlahFitur);
    }

    // Override hitung biaya tanpa parameter
    @Override
    public int hitungBiaya() {
        return super.hitungBiaya() + (jumlahFitur * 10);
    }

    // Method tambahan dengan 2 parameter (epoch dan ukuran batch)
    public int hitungBiaya(int epoch, int ukuranBatch) {
        return getJumlahDataLatih() * epoch * ukuranBatch;
    }
}