package com.modernjava.sealed;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class VehicleTest {

    @Test
    void vehicleTest() {
        var car = new Car();
        var truck = new Truck();

        assertInstanceOf(Vehicle.class, car);
        assertInstanceOf(Vehicle.class, truck);
    }

    @Test
    void driveTest() {
        var car = new Car();
        var truck = new Truck();

        assertEquals("CAR", car.drive());
        assertEquals("TRUCK", truck.drive());
    }

    @Test
    void smartMediaPlayerTest() {
        // https://www.baeldung.com/java-testing-system-out-println

        final PrintStream standardOut = System.out;
        final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        var car = new Car();

        car.connectPhone();
        assertEquals("Phone connected.", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        car.makePhoneCall();
        assertEquals("Making phone call...", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        car.playMusic();
        assertEquals("Playing music.", outputStreamCaptor.toString().trim());

        System.setOut(standardOut);
    }

}