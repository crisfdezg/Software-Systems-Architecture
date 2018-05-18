public class SetPriceG2 extends SetPrice {

    public SetPriceG2(DataStore d) {
        super(d);
    }

    @Override
    public void SetPrice(int g) {
        DS2 d2 = (DS2)d;
        if (g == 1) { // Regular selected
            d2.price = d.Rprice;
        } else if (g == 2) { // Super selected
            d2.price = d.Sprice;
        } else if (g == 3) { // Premium selected
            d2.price = d.Pprice;
        }
        
        if (d2.M == 1){
            d2.price = 1.1*d2.price;
        }
    }
}