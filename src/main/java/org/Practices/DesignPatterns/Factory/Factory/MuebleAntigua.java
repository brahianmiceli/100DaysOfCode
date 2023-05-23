package org.Practices.DesignPatterns.Factory.Factory;

import org.Practices.DesignPatterns.Factory.Impl.InterfaceMuebles;

public class MuebleAntigua implements InterfaceMuebles {
    @Override
    public void crearSilla() {
        System.out.println("se creó una silla antigua");
    }

    @Override
    public void crearMesa() {
        System.out.println("se creo uan mesa antigua");
    }
}
