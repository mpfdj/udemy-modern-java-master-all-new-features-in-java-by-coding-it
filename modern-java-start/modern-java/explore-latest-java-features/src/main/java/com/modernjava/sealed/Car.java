package com.modernjava.sealed;

public sealed class Car extends Vehicle implements SmartMediaPlayer permits FlyingCar {

    @Override
    public String drive() {
        return "CAR";
    }

    @Override
    public void connectPhone() {
        System.out.println("Phone connected.");
    }

    @Override
    public void makePhoneCall() {
        System.out.println("Making phone call...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music.");
    }
}
