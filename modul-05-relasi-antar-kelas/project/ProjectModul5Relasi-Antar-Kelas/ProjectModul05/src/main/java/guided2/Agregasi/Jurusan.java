package guided2.Agregasi;

public class Jurusan {

    private static int JumlahMahasiswa = 0;
    private String KodeJurusan, NamaJurusan;
    private Mahasiswa[] DaftarMahasiswa = new Mahasiswa[32];
   
    // Constructor
    public Jurusan(String kodeJurusan, String namaJurusan) {
        this.KodeJurusan = kodeJurusan;
        this.NamaJurusan = namaJurusan;
    }

    // Behaviour
    public void AddMahasiswa (Mahasiswa m) {
        this.DaftarMahasiswa[JumlahMahasiswa] = m;
        JumlahMahasiswa++;
    }

    public void DisplayMahasiswa() {
        System.out.println("Kode Jurusan : " + this.KodeJurusan);
        System.out.println("Nama Jurusan : " + this.NamaJurusan);
        
        System.out.println("Daftar Mahasiswa :");

        for (int i = 0; i < JumlahMahasiswa; i++) {
            System.out.println((i + 1) + ". " + DaftarMahasiswa[i].GetNIM() + " " + DaftarMahasiswa[i].GetNama());
        }
    }

    // Getter
    public String GetKodeJurusan() {
        return KodeJurusan;
    }

    public String GetNamaJurusan() {
        return NamaJurusan;
    }

    public static int GetJumlahMahasiswa() {
        return JumlahMahasiswa;
    }

    public Mahasiswa[] GetDaftarMahasiswa() {
        return DaftarMahasiswa;
    }

    // Setter
    public void SetKodeJurusan(String KodeJurusan) {
        this.KodeJurusan = KodeJurusan;
    }

    public void SetNamaJurusan(String NamaJurusan) {
        this.NamaJurusan = NamaJurusan;
    }
}