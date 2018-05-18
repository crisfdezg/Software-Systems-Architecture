public class StorePricesG2 extends StorePrices {

    public StorePricesG2(DataStore d) {
        super(d);
    }

    @Override
    public void StorePrices() {
        DS2 d2 = (DS2)d;
        d2.Sprice = d.temp_a;
        d2.Rprice = d.temp_b;
        d2.Pprice = d.temp_c; 
        System.out.println("Prices stored for GasPump2");
    }
}