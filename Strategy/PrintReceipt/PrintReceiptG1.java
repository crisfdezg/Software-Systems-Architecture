public class PrintReceiptG1 extends PrintReceipt {

    public PrintReceiptG1(DataStore d) {
        super(d);
    }

    @Override
    public void PrintReceipt() {
        DS1 d1 = (DS1)d;
        System.out.println("Total number of gallons pumped: " + d1.G);
        System.out.println("Total in your receipt is: " + d1.total);
    }
}