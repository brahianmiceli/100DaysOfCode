package org.Practices.DesignPatterns.Factory.app;


import org.Practices.DesignPatterns.Factory.Factory.FurnitureOld;
import org.Practices.DesignPatterns.Factory.Factory.FurnitureModern;
import org.Practices.DesignPatterns.Factory.Factory.FurnitureVariant;
import org.Practices.DesignPatterns.Factory.Factory.NotCreateFurniture;
import org.Practices.DesignPatterns.Factory.Impl.IFurniture;

import java.util.Scanner;

public class Factory {

    public IFurniture getCrearMueble(){
        Scanner sc = new Scanner(System.in);

        System.out.println("what kind of furniture do you like: Modern , old, variant");

        String in = sc.nextLine();

        if (in == null){
            return new NotCreateFurniture();
        }
        if (in.equalsIgnoreCase("modern")){
            return new FurnitureModern();
        } else if (in.equalsIgnoreCase("old")) {
            return new FurnitureOld();
        } else if (in.equalsIgnoreCase("variant")) {
            return new FurnitureVariant();
        }
        return new NotCreateFurniture();
    }




}
