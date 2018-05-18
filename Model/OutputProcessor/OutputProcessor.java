
public class OutputProcessor {
    
    private DataStore d;
    
    //punteros con minuscula
    private StorePrices storeprices;
    private PayMsg paymsg;
    private EnterPinMsg enterpinmsg;
    private StorePin storepin;
    private StoreCash storecash;
    private DisplayMenu displaymenu;
    private CancelMsg cancelmsg;
    private RejectMsg rejectmsg;
    private SetInitialValues setinitialvalues;
    private StopMsg stopmsg;
    private ReturnCash returncash;
    private SetPrice setprice;
    private ReadyMsg readymsg;
    private PumpGasUnit pumpgasunit;
    private GasPumpedMsg gaspumpedmsg; 
    private PrintReceipt printreceipt; 
    private WrongPinMsg wrongpinmsg;
    private InitializeData initializedata; 
    
    public OutputProcessor (AbstractFactory af) {
        d = af.getData; //esta tambien en el abstract factory
        
        storeprices = af.getStorePrices();
        paymsg = af.getPayMsg();
        enterpinmsg = af.getEnterPinMsg();
        storepin = af.getStorePin();
        storecash = af.getStoreCash();
        displaymenu = af.getDisplayMenu();
        cancelmsg = af.getCancelMsg();
        rejectmsg = af.getRejectMsg();
        setinitialvalues = af.getSetInitialValues();
        stopmsg = af.getStopMsg();
        returncash = af.getReturnCash();
        setprice = af.getSetPrice();
        readymsg = af.getReadyMsg();
        pumpgasunit = af.getPumpGasUnit();
        gaspumpedmsg = af.getGasPumpedMsg(); 
        printreceipt = af.getPrintReceipt(); 
        wrongpinmsg = af.getWrongPinMsg();
        initializedata = af.getInitializeData();
    }
    
    public void StorePrices() {
        this.storeprices.StorePrices();
    }
    
    public void PayMsg() {
        this.paymsg.PayMsg();
    }
    
    public void EnterPinMsg() {
        this.enterpinmsg.EnterPinMsg();
    }    
    
    public void StorePin() {
        this.storepin.StorePin();
    }

    public void StoreCash() {
        this.storecash.StoreCash();
    }

    public void DisplayMenu() {
        this.displayMenu.DisplayMenu();
    }
    
    public void CancelMsg() {
        this.cancelmsg.CancelMsg();
    }
    
    public void RejectMsg() {
        this.rejectmsg.RejectMsg();
    }
    
    public void SetInitialValues() {
        this.setinitialvalues.SetInitialValues();
    }
    
    public void StopMsg() {
        this.stopmsg.StopMsg();
    }
    
    public void ReturnCash() {
        this.returncash.ReturnCash();
    }
    
    public void SetPrice() {
        this.setprice.SetPrice();
    }
    
    public void ReadyMsg() {
        this.readymsg.ReadyMsg();
    }

    public void GasPumpedMsg() {
        this.gaspumpedmsg.GasPumpedMsg();
    }

    public void PumpGasUnit() {
        this.pumpgasunit.PumpGasUnit();
    }

    public void WrongPinMsg() {
        this.wrongpinmsg.WrongPinMsg();
    }

    public void PrintReceipt() {
        this.printreceipt.PrintReceipt();
    }
    
    public void InitializeData() {
        this.initializedata.InitializeData();
    }

}