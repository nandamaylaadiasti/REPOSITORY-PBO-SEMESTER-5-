package guided2.Agregasi;

public class Main {
    public static void main(String[] args) {
        runAsosiasi();
    }

    public static void runAgregasi() {}

    public static void runAsosiasi() {
        Mahasiswa m1 = new Mahasiswa("103132400003", "Mayla Cantik");
        Mahasiswa m2 = new Mahasiswa("103132400100", "Gaih Pargoy");

        Jurusan prodi = new Jurusan("SD", "Sains Data");

        prodi.AddMahasiswa(m1);
        prodi.AddMahasiswa(m2);

        prodi.DisplayMahasiswa();
    }
}
