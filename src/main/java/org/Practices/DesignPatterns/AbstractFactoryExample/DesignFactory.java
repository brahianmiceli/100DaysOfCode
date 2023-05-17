package org.Practices.DesignPatterns.AbstractFactoryExample;

public class DesignFactory implements ServiceFactory {

    @Override
    public ServiceInformatics crearServicio() {
        return new ServiceDesign();
    }

}
