package guided3;

public class Main {
    public static void main(String[] args) {
        Payable[] items = new Payable[2];
        items[0] = new Invoice("Monitor LED", 2, 1500000);
        items[1] = new SalariedEmployee("Mayla", 5000000);

        for (Payable item : items) {
            item.printReceipt();
        }

        Payable.logTransaction(" Semua transaksi berhasil diproses.");
    }
}