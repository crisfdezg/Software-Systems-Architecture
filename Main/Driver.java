public class Driver {

    public static void main(String[] args){ 
        printTitle();
        int selection = printGasPumpSelection(null); 
        if(selection == 1){
            DriverGP1.start(); 
        } else if (selection == 2){
            DriverGP2.start(); 
        }
    }

    
    
    @SuppressWarnings("resource")
    private static int printGasPumpSelection(String errorMessage) {
        if(errorMessage != null) 
            System.out.println(errorMessage+"\n\n");
        System.out.println("Select GasPump1 or GasPump2");
        System.out.println("\n\n\t1. GasPump1"); 
        System.out.println("\t2. GasPump2"); 
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
    int result = 1;
    Scanner s = new Scanner(System.in); 
    char c = s.next().charAt(0);
    if(c == 49){
        result = 1; 
    } else if(c == 50) {
        result = 2; 
    } else {
        printGasPumpSelection("Unknown option."); 
    }
    return result; 
    }
}