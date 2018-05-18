public class StorePinG1 extends StorePin {

    public StorePinG1(DataStore d) {
        super(d);
    }

    @Override
    public void StorePin() {
        DS1 d1 = (DS1)d;
        d1.pin = d.temp_p;
    }
}