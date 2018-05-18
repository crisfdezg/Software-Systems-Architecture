public class GasPumpedMsgG2 extends GasPumpedMsg {

    public GasPumpedMsgG2(DataStore d) {
        super(d);
    }

    @Override
    public void GasPumpedMsg() {
        DS1 d1 = (DS1)d;
        System.out.println("You have pumped one more gallon");
        System.out.println("Total number of gallons pumped: " + d1.G);
    }
    
    @Override
    public void GasPumpedMsg() {
        DS2 d2 = (DS2)d;
        if((d2.M==0)&&(d2.cash>=d2.price*(d2.L+1))) {
            System.out.println("Total number of gallons pumped: " + d2.L);
        } else if (d2.M==1) {
            System.out.println("Total number of gallons pumped: " + d2.L);
            System.out.println("Total amount of money to pay: " + d2.total);
        }
    }  
    
}