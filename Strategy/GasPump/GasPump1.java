
public class GasPump1 {
    DS1 d;
    MDAEFSM m;

    //ESTO HAY QUE PREGUNTAR
    public GasPump1(AbstractFactory af){
        d = (DS1)af.getData();
        m = new MDAEFSM(new OutputProcessor(af));
    }


    public void Activate(float a, float b) {
        if((a>0)&&(b>0)){
            d.temp_a = a;
            d.temp_b = b;
            m.Activate();
        }
    }

    public void Start() {
        m.Start();
    }

    // se pone parametro en paycredit y paydebit?
    public void PayCredit() {
        m.PayType(1);
    }

    public void PayDebit(string p) {
        d.temp_p = p;
        m.PayType(3);
    }

    public void Approved() {
        m.Approved();
    }

    public void Reject() {
        m.Reject();
    }

    public void Cancel() {
        m.Cancel();
    }

    public void Pin(string x) {
        if(d.pin == x) {
            m.CorrectPin();
        } else {
            m.IncorrectPin();
        }
    }

    public void Diesel() {
        m.SelectGas(4);
    }

    public void Regular() {
        m.SelectGas(1);
    }    

    public void StartPump() {
        if (d.price > 0) {
            m.Continue();
            m.StartPump();
        }
    }

    public void PumpGallon() {
        m.Pump();
    }

    public void StopPump() {
        m.StopPump();
        m.Receipt();
    }

    public void FullTank() {
        m.StopPump();
        m.Receipt();
    }
    
}
    

