package org.Practices.DesignPatterns.Factory.Factory;

import org.Practices.DesignPatterns.Factory.Impl.InterfaceMuebles;

public class NoAsignoMuebles implements InterfaceMuebles {
    @Override
    public void crearSilla() {
        System.out.println("Not create chair");
    }

    @Override
    public void crearMesa() {
        System.out.println("Not create table");
    }
}
