public class StorePricesG1 extends StorePrices {

    public StorePricesG1(DataStore d) {
        super(d);
    }

    @Override
    public void StorePrices() {
        DS1 d1 = (DS1)d;
        d1.Rprice = d.temp_a;
        d1.Dprice = d.temp_b;
        System.out.println("Prices stored for GasPump1");
    }
}