package guided;

public class Manusia {

    private String nama;
    private int tinggi;

    public void setInfo(String nama, int tinggi) {
        this.nama = nama;
        this.tinggi = tinggi;
    }

    public void info() {
        System.out.println(this.nama + " memiliki tinggi " + this.tinggi + " cm");
    }
}