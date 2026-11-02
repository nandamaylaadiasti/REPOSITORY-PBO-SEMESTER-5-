package unguided;

public interface ItemTransaksi {
    double getNominalBayar();
    String getNamaTransaksi();

    // Default method (Java 8+)
    default void cetakRincianItem() {
        System.out.println("- " + getNamaTransaksi() + " | Total: Rp" + getNominalBayar());
    }

    // Static method (Java 8+)
    static void catatLogKasir(String pesan) {
        System.out.println("[LOG SISTEM KASIR] " + pesan);
    }
}