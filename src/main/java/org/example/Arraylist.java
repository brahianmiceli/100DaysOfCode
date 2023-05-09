package org.example;


import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> f = new ArrayList<String>();
        f.add("Pizza");
        f.add("Hot Dog");
        f.add("Hamburgers");

        System.out.println("What food i have: "
                + f.toString()); // [Pizza, Hot Dog, Hamburgers]

        System.out.println("The Food found are: "
                + f.size()); // 3

        System.out.println("Removing : "
                + f.remove(0)); // option: 0 , 1 , 2

        System.out.println("do u want add a Coca Cola? ");

        f.add("Coca cola");

        System.out.println("Thanks u for buy in Store. List of Buy is: "
                + f.toString()); // [Hot Dog, Hamburgers, Coca Cola]

     }
}


