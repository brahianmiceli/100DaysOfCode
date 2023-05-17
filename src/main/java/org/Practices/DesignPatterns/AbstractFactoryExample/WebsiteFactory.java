package org.Practices.DesignPatterns.AbstractFactoryExample;
public class WebsiteFactory implements ServiceFactory {

    @Override
    public ServiceInformatics createService() {
        return new ServiceWebsites();
    }

}
