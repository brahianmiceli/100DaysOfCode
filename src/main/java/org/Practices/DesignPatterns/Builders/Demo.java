package org.Practices.DesignPatterns.Builders;

import org.Practices.DesignPatterns.Builders.builder.CarBuilder;
import org.Practices.DesignPatterns.Builders.builder.CarManualBuilder;
import org.Practices.DesignPatterns.Builders.cars.Car;
import org.Practices.DesignPatterns.Builders.cars.Manual;
import org.Practices.DesignPatterns.Builders.director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);


        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
