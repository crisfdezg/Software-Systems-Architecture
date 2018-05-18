public abstract class SetPrice {
    DataStore d;

    public SetPrice(DataStore d) {
        this.d = d;
    }

    public abstract void SetPrice(int g);
}