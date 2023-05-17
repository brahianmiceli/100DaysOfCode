package org.Practices.DesignPatterns.AbstractFactoryExample;

public class SoftwareFactory implements ServiceFactory {

    @Override
    public ServiceInformatics createService() {
        return new ServiceSoftwareEducational();
    }

}
