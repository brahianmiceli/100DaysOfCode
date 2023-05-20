package org.Practices.DesignPatterns.Builders.builder;

import org.Practices.DesignPatterns.Builders.cars.CarType;
import org.Practices.DesignPatterns.Builders.components.Engine;
import org.Practices.DesignPatterns.Builders.components.GPSNavigator;
import org.Practices.DesignPatterns.Builders.components.Transmission;
import org.Practices.DesignPatterns.Builders.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}