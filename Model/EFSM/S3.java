class S3 extends MDAEFSMState {
    
    S3(MDAEFSM m) {
        super(m);
    }
    
    @Override
    void Cancel() {        
        if (m.s == m.LS[4]) {
            m.s = m.LS[1];
            op.CancelMsg();
            op.ReturnCash();
        }
    }
    
    @Override
    void Continue() {        
        if (m.s == m.LS[4]) {
            m.s = m.LS[5];
        }
    } 
    
    @Override
    void SelectGas(int g) {        
        if (m.s == m.LS[4]) {
            m.s = m.LS[4];
            op.SetPrice(g);
        }
    }
}
