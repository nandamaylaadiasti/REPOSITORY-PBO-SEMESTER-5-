package guided3;


// Fondasi umum: belum punya peran spesifik, jadi tidak boleh diinstansiasi langsung
public abstract class Employee implements Payable {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Method abstract: setiap pegawai pasti punya gaji, tapi rumusnya beda-beda
    public abstract double earnings();
    
    @Override
    public double getPaymentAmount() {
        return earnings();
    }
}
