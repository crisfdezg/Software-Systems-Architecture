public class InitializeDataG1 extends InitializeData {

    public InitializeDataG1(DataStore d) {
        super(d);
    }

    @Override
    public void InitializeData() {
        DS1 d1 = (DS1)d;
        d1.price = 0;
    }
}