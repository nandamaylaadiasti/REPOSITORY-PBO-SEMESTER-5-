package guided02;

public class Employee {
    private String nama;
    String departemen;

    public Employee(String nama) {
        this.nama = nama;
    }

    public void tampilNama() {
        System.out.println("Nama : " + nama);
    }
}