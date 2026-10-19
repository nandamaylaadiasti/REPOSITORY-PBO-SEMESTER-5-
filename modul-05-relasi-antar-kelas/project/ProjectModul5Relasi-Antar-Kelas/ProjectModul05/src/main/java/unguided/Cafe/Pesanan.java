package unguided.Cafe;

public class Pesanan {
    private int nomorMeja;
    private ItemPesanan[] daftarItem; // Array penampung (Agregasi)
    private int jumlahItem;

    public Pesanan(int nomorMeja, int kapasitas) {
        this.nomorMeja = nomorMeja;
        this.daftarItem = new ItemPesanan[kapasitas];
        this.jumlahItem = 0;
    }

    public void tambahItem(ItemPesanan item) {
        if (jumlahItem < daftarItem.length) {
            daftarItem[jumlahItem] = item;
            jumlahItem++;
        }
    }

    public void tampilkanPesanan() {
        System.out.println("=== DAFTAR PESANAN CAFE ===");
        System.out.println("Nomor Meja: " + this.nomorMeja);
        for (int i = 0; i < jumlahItem; i++) {
            ItemPesanan item = daftarItem[i];
            System.out.println((i + 1) + ". " + item.getNamaItem() + " - Rp " + item.getRincian().getHargaTotal() + 
                               " (Harga: " + item.getRincian().getHargaDasar() + ", Pajak: " + item.getRincian().getPajak() + ")");
        }
        System.out.println();
    }

    public int getNomorMeja() {
        return nomorMeja;
    }

    public ItemPesanan[] getDaftarItem() {
        return daftarItem;
    }

    public int getJumlahItem() {
        return jumlahItem;
    }
}
