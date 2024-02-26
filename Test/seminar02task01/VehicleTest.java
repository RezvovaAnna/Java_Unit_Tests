package Test.seminar02task01;

import Seminar02Task01.Car;
import Seminar02Task01.Vehicle;
import Seminar02Task01.Motorcycle;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
public class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void carIsCreatedWithFourWheels() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void carIsMotorcycledTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Izhevsk Motorcycles", "Izh Jupiter-5", 2007);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);

    }

    @Test
    void testCarTestDrive() {
        Car car = new Car("Dodge", "Ram", 2010);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void testMotorcycleTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Izhevsk Motorcycles", "Izh Jupiter-5", 2007);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void testParkForCar() {
        Car car = new Car("Dodge", "Ram", 2010);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);

    }

    @Test
    public void testParkForMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Izhevsk Motorcycles", "Izh Jupiter-5", 2007);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
