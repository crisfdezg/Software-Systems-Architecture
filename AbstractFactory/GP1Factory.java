public class GP1Factory extends AbstractFactory {
	private DS1 d;

	public GP1Factory (){
		d = new DS1();
	}
    
	@Override
	public DataStore getData() {
		return d;
	}
    
    @Override
    public StorePrices getStorePrices() {
        return new StorePricesG1();
    }
    
    @Override
    public PayMsg getPayMsg() {
        return new getPayMsgG1();
    }
    
    @Override
    public EnterPinMsg getEnterPinMsg() {
        return new getEnterPinMsgG1();
    }
    
    @Override
    public StorePin getStorePin() {
        return new getStorePinG1();
    }
    
    @Override
    public StoreCash getStoreCash() {
        return new getStoreCashG1();
    }
    
    @Override
    public DisplayMenu getDisplayMenu() {
        return new getDisplayMenuG1();
    }
    
    @Override
    public CancelMsg getCancelMsg() {
        return new getCancelMsgG1();
    }
    
    @Override
    public RejectMsg getRejectMsg() {
        return new getRejectMsgG1();
    }
    
    @Override
    public SetInitialValues getSetInitialValues() {
        return new getSetInitialValuesG1();
    }

    @Override
    public StopMsg getStopMsg() {
        return new getStopMsgG1();
    }
    
    @Override
    public ReturnCash getReturnCash() {
        return new getReturnCashG1();
    } 

    @Override
    public SetPrice getSetPrice() {
        return new getSetPriceG1();
    }
    
    @Override
    public ReadyMsg getReadyMsg() {
        return new getReadyMsgG1();
    }
    
    @Override
    public PumpGasUnit getPumpGasUnit() {
        return new getPumpGasUnitG1();
    }
    
    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        return new getGasPumpedMsgG1();
    } 
    
    @Override
    public PrintReceipt getPrintReceipt() {
        return new getPrintReceiptG1();
    }
    
    @Override
    public WrongPinMsg getWrongPinMsg() {
        return new getWrongPinMsgG1();
    }
    
    @Override
    public InitializeData getInitializeData() {
        return new getInitializeDataG1();
    }
