

public abstract class MDAEFSMState {
    OutputProcessor op;
    DataStore d;
    MDAEFSM m;

    public MDAEFSMState(OutputProcessor op) {
        this.op = op;
    }
    
    private void notAllowed() {
        System.out.println("Operation not allowed");
    }
    
    public void Activate()         {notAllowed();}
    
    public void Start()            {notAllowed();}
    
    public void PayType(int t)     {notAllowed();}
    
    public void Approved()         {notAllowed();}
    
    public void Reject()           {notAllowed();}
    
    public void CorrectPin()       {notAllowed();}

    public void IncorrectPin()     {notAllowed();}
    
    public void Continue()         {notAllowed();}

    public void SelectGas(int g)   {notAllowed();}
    
    public void Cancel()           {notAllowed();}
    
    public void StartPump()        {notAllowed();}
    
    public void Pump()             {notAllowed();}
    
    public void StopPump()         {notAllowed();}
    
    public void Receipt()          {notAllowed();}
    
    public void NoReceipt()        {notAllowed();}
    
}
