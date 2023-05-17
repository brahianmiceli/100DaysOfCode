package org.Practices.DesignPatterns.AbstractFactoryExample;
public class ServiceDesign implements ServiceInformatics {

    @Override
    public void assignWork() {
        System.out.println(
                "1"
        );
    }

    @Override
    public void indicateDeliveryDate() {
        System.out.println(
                "2"
        );
    }

    @Override
    public void informAboutPayment() {
        System.out.println(
                "3"
        );
    }
}
