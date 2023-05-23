package org.Practices.DesignPatterns.Factory.Factory;

import org.Practices.DesignPatterns.Factory.Impl.IFurniture;

public class FurnitureModern implements IFurniture {

    @Override
    public void createChair() {
        System.out.println("Create chair modern");
    }

    @Override
    public void crearMesa() {
        System.out.println("Create table modern");
    }
}
