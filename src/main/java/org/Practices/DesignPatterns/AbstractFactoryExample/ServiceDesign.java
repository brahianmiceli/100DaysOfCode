package org.Practices.DesignPatterns.AbstractFactoryExample;
public class ServiceDesign implements ServiceInformatics {

    @Override
    public void assignWork() {
        System.out.println(
                "Our programmers have been informed of the program to be carried out.");
    }

    @Override
    public void indicateDeliveryDate() {
        System.out.println(
                "The delivery date has been set as 03/25/2014.");
    }

    @Override
    public void informAboutPayment() {
        System.out.println(
                "The amount to be paid will be proportional to the number of students who will use the software.");
    }
}
