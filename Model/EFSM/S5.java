class S5 extends MDAEFSMState {
    
    S5(MDAEFSM m) {
        super(m);
    }
    
    @Override
    void Pump() {        
        if (m.s == m.LS[6]) {
            m.s = m.LS[6];
            op.PumpGasUnit();
            op.GasPumpedMsg();
        }
    }
    
    @Override
    void StopPump() {        
        if (m.s == m.LS[6]) {
            m.s = m.LS[7];
            op.StopMsg();
        }
    } 
    
    @Override
    void FullTank() {        
        if (m.s == m.LS[6]) {
            m.s = m.LS[7];
            op.StopMsg();
        }
    }
}