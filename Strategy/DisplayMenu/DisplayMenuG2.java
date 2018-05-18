public class DisplayMenuG2 extends DisplayMenu {

    @Override
    public void DisplayMenu() {
        // esto no se si hay que ponerlo
        DS2 d2 = (DS2)d;        
        System.out.println("Select gas type:");
        System.out.println("1. Regular gas:" + d2.Rprice);   
        System.out.println("2. Super gas:" + d2.Sprice);
        System.out.println("3. Premium gas:" + d2.Pprice);
    }
}