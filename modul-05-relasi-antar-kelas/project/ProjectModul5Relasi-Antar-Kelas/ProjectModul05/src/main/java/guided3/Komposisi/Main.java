package guided3.Komposisi;

import guided2.Agregasi.*;
import guided3.Komposisi.*;

public class Main {
    public static void main(String[] args) {
        runGuided2();
        runGuided3();
    }


    public static void runGuided1(){}

    public static void runGuided2(){
        Mahasiswa m1 = new Mahasiswa("103132400003", "Mayla cantik");
        Mahasiswa m2 = new Mahasiswa("103132400100", "Galih ganteng");

        Jurusan prodi = new Jurusan("SD","Sains Data");

        prodi.AddMahasiswa(m1);
        prodi.AddMahasiswa(m2);
        prodi.DisplayMahasiswa();

    }
    
    public static void runGuided3(){
        Komputer pc = new Komputer("Intel Core i5",3200,"LG 24 Inch","Logitech","Wireless");
        pc.displaySpecKomputer();
    }
}
