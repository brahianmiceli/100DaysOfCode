package org.example;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ObjectApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<arraylistobj> aObj = new ArrayList<arraylistobj>();

        System.out.println("Welcome to Store Food");
        System.out.println("What do u want add? : ");
        System.out.println("1" + " - Hamburgers and Coca Cola");
        System.out.println("2" + " - Pizza And Coca cola");
        System.out.println("3" + " - HotDog And Coca Cola" );

        int outClient = sc.nextInt();

        switch (outClient) {
            case 1:
                aObj.add(new arraylistobj("Hamburgers","Coca Cola"));
                System.out.println("Ok, Added : " + aObj.get(0).getFoodFirst() + " " + aObj.get(0).getWaterFirst());
                break;
            case 2:
                aObj.add(new arraylistobj("Pizza","Coca Cola"));
                System.out.println("Ok, Added : " + aObj.get(0).getFoodFirst() + " " + aObj.get(0).getWaterFirst());
                break;
            case 3 :
                aObj.add(new arraylistobj("HotDog","Coca Cola"));
                System.out.println("Ok, Added : " + aObj.get(0).getFoodFirst() + " " + aObj.get(0).getWaterFirst());
                break;
            default:
                System.out.println("Invalid Character"); //
        }
    }

}
