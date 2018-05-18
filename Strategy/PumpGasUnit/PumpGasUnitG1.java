public class PumpGasUnitG1 extends PumpGasUnit {

    public PumpGasUnitG1(DataStore d) {
        super(d);
    }

    @Override
    public void PumpGasUnit() {
        DS1 d1 = (DS1)d;
        d1.G += 1;
        d1.total = d1.price * d1.G;
    }
}