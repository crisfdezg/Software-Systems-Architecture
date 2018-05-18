public class DisplayMenuG1 extends DisplayMenu {

    @Override
    public void DisplayMenu() {
        // esto no se si hay que ponerlo
        DS1 d1 = (DS1)d;        
        System.out.println("Select gas type:");
        System.out.println("1. Regular gas:" + d1.Rprice);   
        System.out.println("4. Diesel gas:" + d1.Dprice);
    }
}