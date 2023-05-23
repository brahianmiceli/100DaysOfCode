package org.Practices.DesignPatterns.Factory.Factory;

import org.Practices.DesignPatterns.Factory.Impl.InterfaceMuebles;

public class MuebleModerna implements InterfaceMuebles {

    @Override
    public void crearSilla() {
        System.out.println("se creo una silla moderna");
    }

    @Override
    public void crearMesa() {
        System.out.println("se creo una mesa morderna");
    }
}
