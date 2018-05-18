class Initial extends MDAEFSMState {

    Initial(MDAEFSM m) {
        super(m);
    }

    @Override
    void Activate() {        
        if (m.s == m.LS[0]) {
            m.s = m.LS[1];
            op.StorePrices();
        }
    }
}