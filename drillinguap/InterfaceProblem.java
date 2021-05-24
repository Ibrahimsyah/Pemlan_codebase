package drillinguap;

/**
 *
 * @author Ibrahimsyah
 */

//Berfungsi sebagai kontrak/aturan yang harus dipenuhi
//Bertujuan untuk di implementasikan
interface Payable {
    double getPayableAmount();
}

class Invoice implements Payable {

    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    @Override
    public String toString() {
        String result = "";
        result += "  Nama Barang: " + productName + "\n";
        result += "  Total Harga: " + getPayableAmount() + "\n";
        return result;
    }
}

class Employee implements Payable {

    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        //Jumlah dari semua amount pada invoices
        double result = 0;
        for (Invoice invoice : invoices) {
            result += invoice.getPayableAmount();
        }
        return salaryPerMonth - result;
    }

    @Override
    public String toString() {
        String result = "";
        result += "Registration number: " + registrationNumber + "\n";
        result += "Name: " + name + "\n";
        result += "Salary per Month: " + salaryPerMonth + "\n";
        result += "Jumlah invoices: " + invoices.length + "\n";
        for (int i = 0; i < invoices.length; ++i) {
            result += "  Invoice " + (i + 1) + "\n";
            result += invoices[i];
        }
        result += "Gaji Akhir: " + getPayableAmount() + "\n";
        return result;
    }

}

public class InterfaceProblem {

    public static void main(String[] args) {
        int jumlahInvoices = 3;
        Invoice[] invoices = new Invoice[jumlahInvoices];
        invoices[0] = new Invoice("Barang A", 2, 1000);
        invoices[1] = new Invoice("Barang B", 5, 10000);
        invoices[2] = new Invoice("Barang C", 1, 100000);

        Payable employee = new Employee(1, "Jimbo", 500000, invoices);
        System.out.println(employee);
    }
}
