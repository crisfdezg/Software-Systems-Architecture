public abstract class StorePrices {
    DataStore d;

    public StorePrices (DataStore d) {
        this.d = d;
    }

    public abstract void StorePrices();
}