package unguided;

public class TiketVIP extends TiketBioskop {
    private double biayaFasilitasVIP;

    public TiketVIP(String judulFilm, double hargaDasar, int jumlahKursi, double biayaFasilitasVIP) {
        super(judulFilm, hargaDasar, jumlahKursi);
        this.biayaFasilitasVIP = biayaFasilitasVIP;
    }

    @Override
    public double hitungTotalBayar() {
        return (getHargaDasar() + biayaFasilitasVIP) * getJumlahKursi();
    }

    @Override
    public String getNamaTransaksi() {
        double totalHargaPerKursi = getHargaDasar() + biayaFasilitasVIP;
        return "Tiket VIP Premiere - " + getJudulFilm() + " (" + getJumlahKursi() + " x Rp" + totalHargaPerKursi + ")";
    }
}