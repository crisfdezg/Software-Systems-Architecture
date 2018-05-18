public class SetInitialValuesG2 extends SetInitialValues {

    public SetInitialValuesG2(DataStore d) {
        super(d);
    }

    @Override
    public void SetInitialValues() {
        DS2 d2 = (DS2)d;
        d2.L = 0;
        d2.total = 0;
    }
}