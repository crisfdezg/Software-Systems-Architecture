public class InitializeDataG2 extends InitializeData {

    public InitializeDataG2(DataStore d) {
        super(d);
    }

    @Override
    public void InitializeData() {
        DS2 d2 = (DS2)d;
        d2.M = 1;
    }
}