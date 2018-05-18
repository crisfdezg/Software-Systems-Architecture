class S4 extends MDAEFSMState {

    S4(MDAEFSM m) {
        super(m);
    }

    @Override
    void StartPump() {
        if (m.s == m.LS[5]) {
            m.s = m.LS[6];
            op.SetInitialValues();
            op.ReadyMsg();
        }
    }
}