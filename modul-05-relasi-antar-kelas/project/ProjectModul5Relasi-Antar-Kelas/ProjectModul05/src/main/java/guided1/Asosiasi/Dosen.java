package guided1.Asosiasi;

public class Dosen {

    private String kodeDosen;
    private String namaDosen;
    private int nilai;
    
    //Setter
    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }
    
    //Getter
    public String getKodeDosen() {
        return this.kodeDosen;
    }

    public String getNamaDosen() {
        return this.namaDosen;
    }

    public void giveScore(Mahasiswa s, int nilai) {
    s.setNilai(nilai);
    }

    public int getScore(Mahasiswa s) {
    return s.getNilai();
    }

    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.setNim("103132400003");
        m.setNama("Mayla Cantik");
        Dosen d = new Dosen();
        d.giveScore(m, 100);
        System.out.println("Nim :" + m.getNim());
        System.out.println("Nama :" + m.getNama());
        System.out.println("Nilai :" + d.getScore(m));
    }
}
