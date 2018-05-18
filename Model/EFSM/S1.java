class S1 extends MDAEFSMState {
    
    S1(MDAEFSM m) {
        super(m);
    }
    
    @Override
    void PayType(int t) {
        if ((t == 1) && (m.s == m.LS[2])) {
            m.s = m.LS[3];
        } else if ((t == 2) && (m.s == m.LS[2])) {
            op.StoreCash();
            op.DisplayMenu();
            m.s = m.LS[4];
        } else if ((t == 3) && (m.s == m.LS[2])) {
            op.EnterPinMsg();
            op.StorePin();
            m.s = m.LS[8];
        }
    }
}