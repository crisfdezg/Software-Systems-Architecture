public class SetPriceG1 extends SetPrice {

    public SetPriceG1(DataStore d) {
        super(d);
    }

    @Override
    public void SetPrice(int g) {
        DS1 d1 = (DS1)d;
        if (g == 1) { // Regular selected
            d1.price = d.Rprice;
        } else if (g == 4) { // Diesel selected
            d1.price = d.Dprice;
        }
    }
}