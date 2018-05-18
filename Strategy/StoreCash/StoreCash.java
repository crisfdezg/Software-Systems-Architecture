public abstract class StoreCash {
    DataStore d;

    public StoreCash (DataStore d) {
        this.d = d;
    }

    public abstract void StoreCash();
}