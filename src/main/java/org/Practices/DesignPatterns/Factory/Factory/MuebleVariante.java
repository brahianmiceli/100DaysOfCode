package org.Practices.DesignPatterns.Factory.Factory;

import org.Practices.DesignPatterns.Factory.Impl.InterfaceMuebles;

public class MuebleVariante implements InterfaceMuebles {
    @Override
    public void crearSilla() {
        System.out.println("Se creó una silla plastica");
    }

    @Override
    public void crearMesa() {
        System.out.println("Se creó una mesa plastica");
    }
}
