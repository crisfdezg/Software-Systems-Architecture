class S2 extends MDAEFSMState {
    
    S2(MDAEFSM m) {
        super(m);
    }
    
    @Override
    void Approved() {        
        if (m.s == m.LS[3]) {
            m.s = m.LS[4];
            op.DisplayMenu();
        }
    }
    
    @Override
    void Rejected() {        
        if (m.s == m.LS[3]) {
            m.s = m.LS[1];
            op.RejectMsg();
        }
    } 
}
