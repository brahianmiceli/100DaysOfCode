package org.Practices.DesignPatterns.Factory.Factory;

import org.Practices.DesignPatterns.Factory.Impl.InterfaceMuebles;

public class MuebleAntigua implements InterfaceMuebles {
    @Override
    public void crearSilla() {
        System.out.println("Create chair old");
    }

    @Override
    public void crearMesa() {
        System.out.println("Create table old");
    }
}
