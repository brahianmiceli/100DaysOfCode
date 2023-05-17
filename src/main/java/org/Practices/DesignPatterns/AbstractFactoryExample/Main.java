package org.Practices.DesignPatterns.AbstractFactoryExample;

import java.util.Scanner;

public class Main {

    private static Scanner S = new Scanner(System.in);
    
    public static void main(String[] args) {
        int o;
        do{
            o = queryService();
            switch(o) {
                case 1:
                    useService(new DesignFactory());
                    break;
                case 2:
                    useService(new SoftwareFactory());
                    break;
                case 3:
                    useService(new WebsiteFactory());
                    break;
                case 4:
                    System.out.println("Close Program.");
                    break;
                default:
                    System.out.println("Invalid option entered.");
            }
            System.out.print("\n");
        }while(o!=4);
    }
    
    public static void useService(ServiceFactory factory) {
        ServiceInformatics services = factory.createService();
        services.assignWork();
        services.informAboutPayment();
        services.indicateDeliveryDate();
    }
    
    public static int queryService() {
        System.out.print(
                "MENU OF OPTIONS: \n"
              + "---- -- -------->\n"
              + "1. Request graphic design service.\n"
              + "2. Request educational software development.\n"
              + "3. Request website creation.\n"
              + "4. Close Program.\n"
              + "Select option: "
        );
        return Integer.parseInt( S.nextLine() );
    }
}
