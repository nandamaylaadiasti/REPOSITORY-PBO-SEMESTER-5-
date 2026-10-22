package unguided;

public class ModelKlasifikasi extends ModelML {
    private int jumlahKelas;

    // Constructor
    public ModelKlasifikasi(String namaModel, int jumlahDataLatih, int jumlahKelas) {
        super(namaModel, jumlahDataLatih);
        this.jumlahKelas = jumlahKelas;
    }

    public int getJumlahKelas() {
        return jumlahKelas;
    }

    // Override tampilkan informasi
    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Jumlah kelas: " + jumlahKelas);
    }

    // Override hitung biaya tanpa parameter: biaya = (biaya versi kelas induk) * jumlah kelas
    @Override
    public int hitungBiaya() {
        return super.hitungBiaya() * jumlahKelas;
    }
}