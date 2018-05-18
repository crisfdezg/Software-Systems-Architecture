public abstract class InitializeData {
    DataStore d;

    public InitializeData (DataStore d) {
        this.d = d;
    }

    public abstract void InitializeData();
}