public class GasPumpedMsgG1 extends GasPumpedMsg {

    public GasPumpedMsgG1(DataStore d) {
        super(d);
    }

    @Override
    public void GasPumpedMsg() {
        DS1 d1 = (DS1)d;
        System.out.println("You have pumped one more gallon");
        System.out.println("Total number of gallons pumped: " + d1.G);
    }
}