package org.Practices.DesignPatterns.AbstractFactoryExample;
public class ServiceDesign implements ServiceInformatics {

    @Override
    public void assignWork() {
        System.out.println(
                "abc");
    }

    @Override
    public void indicateDeliveryDate() {
        System.out.println(
                "abc.");
    }

    @Override
    public void informAboutPayment() {
        System.out.println(
                "abc");
    }
}
