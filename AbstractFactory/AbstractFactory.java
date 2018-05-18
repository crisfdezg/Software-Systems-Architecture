public abstract class AbstractFactory { 
    
    public abstract DataStore getData(); //este hay que ponerlo?
    
    public abstract StorePrices getStorePrices();
    
    public abstract PayMsg getPayMsg();
    
    public abstract EnterPinMsg getEnterPinMsg();

    public abstract StorePin getStorePin();
    
    public abstract StoreCash getStoreCash();

    public abstract DisplayMenu getDisplayMenu();
    
    public abstract CancelMsg getCancelMsg();
    
    public abstract RejectMsg getRejectMsg();
    
    public abstract SetInitialValues getSetInitialValues();

    public abstract StopMsg getStopMsg();
    
    public abstract ReturnCash getReturnCash();

    public abstract SetPrice getSetPrice();
    
    public abstract ReadyMsg getReadyMsg();
    
    public abstract PumpGasUnit getPumpGasUnit();
    
    public abstract GasPumpedMsg getGasPumpedMsg(); 
    
    public abstract PrintReceipt getPrintReceipt(); 
    
    public abstract WrongPinMsg getWrongPinMsg();
    
    public abstract InitializeData getInitializeData();
}