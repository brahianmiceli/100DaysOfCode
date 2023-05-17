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
        ServiceInformatics servicio = factory.createService();
        servicio.asignarTrabajo();
        servicio.indicarFechaEntrega();
        servicio.informarSobrePago();
    }
    
    public static int queryService() {
        System.out.print(
                "MENÚ DE OPCIONES\n"
              + "---- -- -------->\n"
              + "1. Solicitar servicio de diseño gráfico.\n"
              + "2. Solicitar desarrollo de software educacional.\n"
              + "3. Solicitar creación de sitios web.\n"
              + "4. Cerrar programa.\n"
              + "Seleccione opción: "
        );
        return Integer.parseInt( S.nextLine() );
    }
}
