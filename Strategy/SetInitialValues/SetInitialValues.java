public abstract class SetInitialValues {
    DataStore d;

    public SetInitialValues (DataStore d) {
        this.d = d;
    }

    public abstract void SetInitialValues();
}