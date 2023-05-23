package org.Practices.DesignPatterns.Factory.app;


import org.Practices.DesignPatterns.Factory.Factory.MuebleAntigua;
import org.Practices.DesignPatterns.Factory.Factory.MuebleModerna;
import org.Practices.DesignPatterns.Factory.Factory.MuebleVariante;
import org.Practices.DesignPatterns.Factory.Factory.NoAsignoMuebles;
import org.Practices.DesignPatterns.Factory.Impl.InterfaceMuebles;

import java.util.Scanner;

public class Factory {

    public InterfaceMuebles getCrearMueble(){
        Scanner sc = new Scanner(System.in);

        System.out.println("what kind of furniture do you like: Modern , old, variant");

        String in = sc.nextLine();

        if (in == null){
            return new NoAsignoMuebles();
        }
        if (in.equalsIgnoreCase("modern")){
            return new MuebleModerna();
        } else if (in.equalsIgnoreCase("old")) {
            return new MuebleAntigua();
        } else if (in.equalsIgnoreCase("variant")) {
            return new MuebleVariante();
        }
        return new NoAsignoMuebles();
    }




}
