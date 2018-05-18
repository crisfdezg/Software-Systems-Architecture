public class StoreCashG2 extends StoreCash {

    public StoreCashG2(DataStore d) {
        super(d);
    }

    @Override
    public void StoreCash() {
        DS2 d2 = (DS2)d;
        d2.M = 0;
        d2.cash = d.temp_cash;
    }
}