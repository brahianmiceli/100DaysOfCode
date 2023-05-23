package org.Practices.DesignPatterns.Factory.Factory;

import org.Practices.DesignPatterns.Factory.Impl.IFurniture;

public class FurnitureVariant implements IFurniture {
    @Override
    public void createChair() {
        System.out.println("Create chair variant");
    }

    @Override
    public void createTable() {
        System.out.println("Create table variant");
    }
}
