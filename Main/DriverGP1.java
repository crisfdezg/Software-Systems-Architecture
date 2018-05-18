import java.util.Scanner;

    public class Driver {
    
        public static void main(String[] args){
        
            GasPump1 gp1 = new GasPump1();
            float a, b;
            string p1;
            string x1;
            char ch;
            
            //Menu
            System.out.println("\t\t\t\t\tGasPump-1");
            System.out.println("\t\tMENU of Operations");
            System.out.println("\t\t0. Activate(float, float)");
            System.out.println("\t\t1. Start()");
            System.out.println("\t\t2. PayCredit()");
            System.out.println("\t\t3. Reject()");
            System.out.println("\t\t4. PayDebit(string)");
            System.out.println("\t\t5. Pin(string)");
            System.out.println("\t\t6. Cancel()");
            System.out.println("\t\t7. Approved()");
            System.out.println("\t\t8. Diesel()");
            System.out.println("\t\t9. Regular()");
            System.out.println("\t\ta. StartPump()");
            System.out.println("\t\tb. PumpGallon()");
            System.out.println("\t\tc. StopPump()");
            System.out.println("\t\td. FullTank()");
            System.out.println("\t\tq. Quit the program");
            System.out.println("\t\tPlease make a note of these operations");
            System.out.println("\t\tGasPump1 Execution");
        
            Scanner reader=new Scanner(System.in);
            ch = '1';
            while (ch !='q') {
                System.out.println(" Select Operation: ");
                System.out.println("0-Activate,1-Start,2-PayCredit,3-Reject,4-PayDebit,5-Pin,6-Cancel,");
                System.out.println("7-Approved,8-Diesel,9-Regular,a-StartPump,b-PumpGallon,c-StopPump,d-FullTank,q-quit");
                System.out.println("enter your choice1");
                ch =(char) reader.next().charAt(0);
                
                switch (ch) {
                
                case '0': { //Activate()
                    System.out.println(" Operation:");
                    System.out.println(" Enter value:");
                    
                    a = reader.nextFloat();
                    System.out.println(" Enter value");
                    b = reader.nextFloat();
                    gp1.Activate(a,b);
                    break;
                }
                    
                case '1': { //Start
                    System.out.println(" Operation: Start()");
                    gp1.Start();
                    break;
                }
                    
                case '2': { //PayCredit
                    System.out.println(" Operation: PayCredit()");
                    gp1.PayCredit();
                    break;
                }
                    
                case '3': { //Reject
                    System.out.println(" Operation: Reject()");
                    gp1.Reject();
                    break;
                }
                    
                case '4': {//PayDebit
                    System.out.println(" Operation: PayDebit(int p)");
                    System.out.println(" Enter value of the parameter p:");
                    p1 = reader.nextString();
                    gp1.PayDebit(p1);
                    break;
                }
                    
                case '5': {//Pin
                    System.out.println(" Operation: Pin(int x)");
                    System.out.println(" Enter value of the parameter x:");
                    x1 = reader.nextString();
                    gp1.Pin(x1);
                    break;
                }
                    
                case '6': {//Cancel
                    System.out.println(" Operation: Cancel()");
                    gp1.Cancel();
                    break;
                }
                
                case '7': { //Approved
                    System.out.println(" Operation: Approved()");
                    gp1.Approved();
                    break;
                }
                
                case '8': { //Diesel
                    System.out.println("Operation: Diesel()");
                    gp1.Diesel();
                    break;
                }
                
                case '9': { //Regular
                    System.out.println(" Operation: Regular()");
                    gp1.Regular();
                    break;
                }
                
                case 'a': { //StartPump
                    System.out.println(" Operation: StartPump()");
                    gp1.StartPump();
                    break;
                }
                
                case 'b': { //PumpGallon
                    System.out.println(" Operation: PumpGallon()");
                    gp1.PumpGallon();
                    break;
                }
                
                case 'c': { //StopPump
                    System.out.println(" Operation: StopPump()");
                    gp1.StopPump();
                    break;
                }
                
                case 'd': { //FullTank
                    System.out.println(" Operation: FullTank()");
                    gp1.FullTank();
                    break;
                }
                
                case 'q': break;
                
                }
            }
    }//main
}