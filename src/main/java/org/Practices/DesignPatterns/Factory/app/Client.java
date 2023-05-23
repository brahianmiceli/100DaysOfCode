package org.Practices.DesignPatterns.Factory.app;

import org.Practices.DesignPatterns.Factory.Impl.InterfaceMuebles;

public class Client {

    public static void main(String[] args) {

        Factory f = new Factory();

        System.out.println("Bievenidos");
        InterfaceMuebles m = f.getCrearMueble();
        m.crearMesa();
        m.crearSilla();


    }
}
