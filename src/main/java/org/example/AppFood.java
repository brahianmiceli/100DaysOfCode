package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class AppFood { //17 Days Of Code
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<ArraylistObj> aObj = new ArrayList<ArraylistObj>();

        System.out.println("Welcome to Store Food");
        System.out.println("What do u want add? : ");
        System.out.println("1" + " - Hamburgers and Coca Cola");
        System.out.println("2" + " - Pizza and Coca cola");
        System.out.println("3" + " - HotDog and Coca Cola" );
        //System.out.println("0" + "food and water" );

        int outClient = sc.nextInt();

        if (outClient<=1) {
            aObj.add(new ArraylistObj("Hamburgers", "Coca Cola"));
        }else if (outClient<=2){
            aObj.add(new ArraylistObj("Pizza","Coca Cola"));
        }else if (outClient<=3){
            aObj.add(new ArraylistObj("HotDog","Coca Cola"));
        }else{
            System.out.println("Option Incorrect");
        }

        for (int i=0; i < aObj.size(); i++){
            System.out.println("Food Added: "
                    + aObj.get(i).getFoodFirst()
                    + " and "
                    + aObj.get(i).getWaterFirst());
        }
    }
}
