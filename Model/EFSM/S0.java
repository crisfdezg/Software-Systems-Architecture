class S0 extends MDAEFSMState {

    S0(MDAEFSM m) {
        super(m);
    }

    @Override
    void Start() {
        if (m.s == m.LS[1]) {
            m.s = m.LS[2];
            op.PayMsg();
            op.InitializeData();
        }
    }
}