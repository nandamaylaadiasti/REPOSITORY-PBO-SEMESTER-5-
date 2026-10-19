package guided2.Agregasi;

public class Mahasiswa {
    private String NIM, Nama;

    public Mahasiswa(String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
    }

    //Getter
    public String GetNIM() {
        return (NIM);
    }

    public String GetNama() {
        return (Nama);
    }
    
    //Setter
    public void SetNim(String NIM){
        this.NIM = NIM;
    }
    
    public void SetNama(String Nama){
        this.Nama = Nama;
    }
}
