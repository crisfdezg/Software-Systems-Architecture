class S6 extends MDAEFSMState {
    
    S6(MDAEFSM m) {
        super(m);
    }
    
    @Override
    void Receipt() {        
        if (m.s == m.LS[7]) {
            m.s = m.LS[1];
            op.PrintReceipt();
            op.ReturnCash();
        }
    }
    
    @Override
    void NoReceipt() {        
        if (m.s == m.LS[7]) {
            m.s = m.LS[1];
            op.ReturnCash();
        }
    } 
}
