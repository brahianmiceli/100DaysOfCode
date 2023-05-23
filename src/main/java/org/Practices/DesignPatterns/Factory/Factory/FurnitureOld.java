package org.Practices.DesignPatterns.Factory.Factory;

import org.Practices.DesignPatterns.Factory.Impl.IFurniture;

public class FurnitureOld implements IFurniture {
    @Override
    public void createChair() {
        System.out.println("Create chair old");
    }

    @Override
    public void crearMesa() {
        System.out.println("Create table old");
    }
}
