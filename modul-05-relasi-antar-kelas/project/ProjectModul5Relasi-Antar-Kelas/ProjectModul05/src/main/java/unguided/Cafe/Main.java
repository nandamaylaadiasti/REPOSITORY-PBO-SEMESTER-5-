package unguided.Cafe;

public class Main {
    public static void main(String[] args) {
        // 1. Buat 1 objek Kasir
        Kasir kasir = new Kasir("Budi");

        // 2. Buat 3 objek ItemPesanan secara independen (Agregasi)
        ItemPesanan item1 = new ItemPesanan("Iced Americano", 18000);
        ItemPesanan item2 = new ItemPesanan("Beef Croissant", 25000);
        ItemPesanan item3 = new ItemPesanan("Matcha Latte", 22000);

        // 3. Buat 1 objek Pesanan untuk Meja 4 (kapasitas 5 item)
        Pesanan pesananMeja4 = new Pesanan(4, 5);

        // 4. Masukkan ketiga objek ItemPesanan ke dalam objek Pesanan
        pesananMeja4.tambahItem(item1);
        pesananMeja4.tambahItem(item2);
        pesananMeja4.tambahItem(item3);

        // 5. Tampilkan rincian pesanan
        pesananMeja4.tampilkanPesanan();

        // 6. Jalankan pemrosesan pembayaran oleh kasir (Asosiasi)
        kasir.prosesPembayaran(pesananMeja4);
    }
}