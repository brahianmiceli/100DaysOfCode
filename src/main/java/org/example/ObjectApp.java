package org.example;

public class ObjectApp {
    public static void main(String[] args) {
        users u = new users();

        u.setName("Jean");
        u.setLastname("Miceli");

        System.out.println("My name is: " + u.getName() + " and " + u.getLastname());
    }

}
