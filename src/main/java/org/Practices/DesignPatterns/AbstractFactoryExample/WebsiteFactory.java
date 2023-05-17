package org.Practices.DesignPatterns.AbstractFactoryExample;
public class WebsiteFactory implements ServiceFactory {

    @Override
    public ServiceInformatics crearServicio() {
        return new ServiceWebsites();
    }

}
