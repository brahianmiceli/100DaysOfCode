package org.Practices.DesignPatterns.Factory.app;

import org.Practices.DesignPatterns.Factory.Impl.IFurniture;

public class Client {

    public static void main(String[] args) {

        Factory f = new Factory();

        System.out.println("Welcome to Program");

        IFurniture m = f.getCreateFurniture();
        m.createTable();
        m.createChair();


    }
}
