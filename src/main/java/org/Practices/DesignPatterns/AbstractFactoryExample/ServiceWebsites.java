package org.Practices.DesignPatterns.AbstractFactoryExample;

public class ServiceWebsites implements ServiceInformatics {


    @Override
    public void assignWork() {
            System.out.println("El personal encargado del desarrollo de sitios web ha aceptado el trabajo.");
    }


    @Override
    public void indicateDeliveryDate() {
        System.out.println("El sitio web con Responsive Design será terminado a más tardar el día 26/04/2014.");
    }

    @Override
    public void informAboutPayment() {
        System.out.println("El monto a pagar no incluye el pago por dominio y hosting.");
    }
}

