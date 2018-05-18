
public class GasPump2 {
    DS2 d;
    MDAEFSM m;

    //ESTO HAY QUE PREGUNTAR
    public GasPump2(AbstractFactory af){
        d = (DS2)af.getData();
        m = new MDAEFSM(new OutputProcessor(af));
    }


    public void Activate(float a, float b, float c) {
        if((a>0)&&(b>0)&&(c>0)){
            d.temp_a = a;
            d.temp_b = b;
            d.temp_c = c;
            m.Activate();
        }
    }

    public void PayCash(float c) {
        if (c>0) {
            d.temp_cash = c;
            m.Start();
            m.PayType(2);
        }
    }
    
    public void PayCredit() {
        m.Start();
        m.PayType(1);
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

    public void Super() {
        m.SelectGas(2);
    }

    public void Premium() {
        m.SelectGas(3);
    }
    
    public void Regular() {
        m.SelectGas(1);
    }    

    public void StartPump() {
        m.StartPump();
    }

    public void PumpLiter() {
        if ((d.cash > 0)&&(d.cash < d.price*(d.L+1))){
            m.StopPump();
        } else {
           m.Pump(); 
        }
    }

    public void Stop() {
        m.StopPump();
    }

    public void Receipt() {
        m.Receipt();
    }
    
    public void NoReceipt() {
        m.NoReceipt();
    }
    
}