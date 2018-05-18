public class SetInitialValuesG1 extends SetInitialValues {

    public SetInitialValuesG1(DataStore d) {
        super(d);
    }

    @Override
    public void SetInitialValues() {
        DS1 d1 = (DS1)d;
        d1.G = 0;
        d1.total = 0;
    }
}