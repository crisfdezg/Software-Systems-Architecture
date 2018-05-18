public class GP2Factory extends AbstractFactory {
	private DS2 d;

	public GP2Factory (){
		d = new DS2();
	}
    
	@Override
	public DataStore getData() {
		return d;
	}
    
    @Override
    public StorePrices getStorePrices() {
        return new StorePricesG2();
    }
    
    @Override
    public PayMsg getPayMsg() {
        return new getPayMsgG2();
    }
    
    @Override
    public EnterPinMsg getEnterPinMsg() {
        return new getEnterPinMsgG2();
    }
    
    @Override
    public StorePin getStorePin() {
        return new getStorePinG2();
    }
    
    @Override
    public StoreCash getStoreCash() {
        return new getStoreCashG2();
    }
    
    @Override
    public DisplayMenu getDisplayMenu() {
        return new getDisplayMenuG2();
    }
    
    @Override
    public CancelMsg getCancelMsg() {
        return new getCancelMsgG2();
    }
    
    @Override
    public RejectMsg getRejectMsg() {
        return new getRejectMsgG2();
    }
    
    @Override
    public SetInitialValues getSetInitialValues() {
        return new getSetInitialValuesG2();
    }

    @Override
    public StopMsg getStopMsg() {
        return new getStopMsgG2();
    }
    
    @Override
    public ReturnCash getReturnCash() {
        return new getReturnCashG2();
    } 

    @Override
    public SetPrice getSetPrice() {
        return new getSetPriceG2();
    }
    
    @Override
    public ReadyMsg getReadyMsg() {
        return new getReadyMsgG2();
    }
    
    @Override
    public PumpGasUnit getPumpGasUnit() {
        return new getPumpGasUnitG2();
    }
    
    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        return new getGasPumpedMsgG2();
    } 
    
    @Override
    public PrintReceipt getPrintReceipt() {
        return new getPrintReceiptG2();
    }
    
    @Override
    public WrongPinMsg getWrongPinMsg() {
        return new getWrongPinMsgG2();
    }
    
    @Override
    public InitializeData getInitializeData() {
        return new getInitializeDataG2();
    }