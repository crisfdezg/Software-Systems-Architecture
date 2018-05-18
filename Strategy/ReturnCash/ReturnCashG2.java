public class ReturnCashG2 extends ReturnCash {

    public ReturnCashG2(DataStore d) {
        super(d);
    }

    @Override
    public void ReturnCash() {
        DS2 d2 = (DS2)d;
        float cash_return = d2.cash - d2.total;
        if (cash_return > 0) {
            System.out.println("Cash to return: $" + cash_return);
        }
    }
}