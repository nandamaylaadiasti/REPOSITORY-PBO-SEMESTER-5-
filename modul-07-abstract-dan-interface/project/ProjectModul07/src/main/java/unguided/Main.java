package unguided;

public class Main {
    public static void main(String[] args) {
        // 1. Uji Proteksi Abstraksi (Dijadikan komentar karena kelas abstrak tidak bisa di-instansiasi langsung)
        // TiketBioskop test = new TiketBioskop("Test", 10000, 1);

        // 2. Buka Kasir
        ItemTransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan #042.");

        // 3. Buat Objek Transaksi
        TiketReguler tiketReg = new TiketReguler("Interstellar", 40000, 2, 3);
        TiketVIP tiketVip = new TiketVIP("Dune: Part Two", 60000, 2, 25000);
        PaketSnack snack = new PaketSnack("Combo Popcorn Caramel + 2 Soda", 1, 55000);

        // 4. Array Polimorfik Heterogen
        ItemTransaksi[] items = new ItemTransaksi[3];
        items[0] = tiketReg;
        items[1] = tiketVip;
        items[2] = snack;

        // 5. Pemrosesan Dinamis (Loop) & Penghitungan Akumulatif
        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");
        double grandTotal = 0;

        for (ItemTransaksi item : items) {
            item.cetakRincianItem(); // Memanggil default method interface
            grandTotal += item.getNominalBayar();
        }

        // 6. Tutup Kasir & Cetak Grand Total
        System.out.println("-------------------------------------------------------------");
        System.out.println("TOTAL TRANSAKSI : Rp" + grandTotal);
        System.out.println("=============================================================");
        ItemTransaksi.catatLogKasir("Transaksi #042 selesai diproses.");
    }
}