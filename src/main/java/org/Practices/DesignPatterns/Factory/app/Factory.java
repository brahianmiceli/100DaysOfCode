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

        System.out.println("Que tipo de mueble desea: Moderna , Antigua , Variante");

        String in = sc.nextLine();

        if (in == null){
            return new NoAsignoMuebles();
        }
        if (in.equalsIgnoreCase("Moderna")){
            return new MuebleModerna();
        } else if (in.equalsIgnoreCase("Antigua")) {
            return new MuebleAntigua();
        } else if (in.equalsIgnoreCase("Variante")) {
            return new MuebleVariante();
        }
        return new NoAsignoMuebles();
    }




}
