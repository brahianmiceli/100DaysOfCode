package org.Practices.DesignPatterns.AbstractFactoryExample;

public class SoftwareFactory implements ServiceFactory {

    @Override
    public ServiceInformatics crearServicio() {
        return new ServiceSoftwareEducational();
    }

}
