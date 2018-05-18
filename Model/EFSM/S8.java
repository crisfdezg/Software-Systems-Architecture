class S8 extends MDAEFSMState {
    
    S8(MDAEFSM m) {
        super(m);
    }
    
    @Override
    void CorrectPin() {        
        if (m.s == m.LS[8]) {
            m.s = m.LS[4];
            op.DisplayMenu();
        }
    }
    
    @Override
    void IncorrectPin() {        
        if (m.s == m.LS[8]) {
            m.s = m.LS[1];
            op.WrongPinMsg();
        }
    } 
}