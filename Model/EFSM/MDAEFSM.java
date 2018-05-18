public class MDAEFSM {
    protected State s;
    protected State[] LS;

    
    public MDAEFSM() {
        LS = new State[9];

        LS[0] = new Initial(this);
        LS[1] = new S0(this);
        LS[2] = new S1(this);
        LS[3] = new S2(this);
        LS[4] = new S3(this);
        LS[5] = new S4(this);
        LS[6] = new S5(this);
        LS[7] = new S6(this);
        LS[8] = new S8(this);

        s = LS[0];
    }
    
    public void Activate() {
        s.Activate();
    }
    
    public void Start() {
        s.Start();
    }
    
    public void PayType(int t) {
        s.PayType(t);
    }
     
    public void Approved() {
        s.Approved();
    }
    
    public void Reject() {
        s.Reject();
    }
    
    public void CorrectPin() {
        s.CorrectPin();
    }

    public void IncorrectPin() {
        s.IncorrectPin();
    }
    
    public void Continue() {
        s.Continue();
    }

    public void SelectGas(int g) {
        s.SelectGas(g):
    }
    
    public void Cancel() {
        s.Cancel();
    }
    
    public void StartPump() {
        s.StartPump();
    }
    
    public void Pump() {
        s.Pump();
    }
    
    public void StopPump() {
        s.StopPump();
    }
    
    public void Receipt() {
        s.Receipt();                
    }
    
    public void NoReceipt() {
        s.NoReceipt();
    }

}