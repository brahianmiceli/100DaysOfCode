package org.Practices.DesignPatterns.Factory.Factory;

import org.Practices.DesignPatterns.Factory.Impl.IFurniture;

public class NotCreateFurniture implements IFurniture {
    @Override
    public void createChair() {
        System.out.println("Not create chair");
    }

    @Override
    public void createTable() {
        System.out.println("Not create table");
    }
}
