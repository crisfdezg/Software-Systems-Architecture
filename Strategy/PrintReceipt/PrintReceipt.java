public abstract class PrintReceipt {
    DataStore d;

    public PrintReceipt (DataStore d) {
        this.d = d;
    }

    public abstract void PrintReceipt();
}