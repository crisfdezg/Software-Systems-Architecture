public class PumpGasUnitG2 extends PumpGasUnit {

    public PumpGasUnitG2(DataStore d) {
        super(d);
    }

    @Override
    public void PumpGasUnit() {
        DS2 d2 = (DS2)d;
        if((d2.M==0)&&(d2.cash>=d2.price*(d2.L+1))) {
            d2.L=d2.L+1; 
            d2.total=d2.price*d2.L;
        } else if (d2.M==1) {
            d2.L=d2.L+1; 
            d2.total=d2.price*d2.L;
        }
    }
}
    