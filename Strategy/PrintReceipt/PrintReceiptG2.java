public class PrintReceiptG2 extends PrintReceipt {

    public PrintReceiptG2(DataStore d) {
        super(d);
    }

    @Override
    public void PrintReceipt() {
        DS2 d2 = (DS2)d;
        System.out.println("Total number of liters pumped: " + d2.L);
        System.out.println("Total in your receipt is: " + d2.total);
    }
}