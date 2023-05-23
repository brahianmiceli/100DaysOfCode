package org.Practices.DesignPatterns.Factory.Factory;

import org.Practices.DesignPatterns.Factory.Impl.InterfaceMuebles;

public class MuebleVariante implements InterfaceMuebles {
    @Override
    public void crearSilla() {
        System.out.println("Create chair variant");
    }

    @Override
    public void crearMesa() {
        System.out.println("Create table variant");
    }
}
