package org.Practices.DesignPatterns.AbstractFactoryExample;

public class ServiceWebsites implements ServiceInformatics {


    @Override
    public void assignWork() {
            System.out.println("The website development staff has accepted the job.");
    }


    @Override
    public void indicateDeliveryDate() {
        System.out.println("The Responsive Design website will be completed no later than 04/26/2014.");
    }

    @Override
    public void informAboutPayment() {
        System.out.println("The amount to be paid does not include domain and hosting fees.");
    }
}

