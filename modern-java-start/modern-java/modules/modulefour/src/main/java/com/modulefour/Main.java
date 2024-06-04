package com.modulefour;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("I am from unnamed Module");
        System.out.println(Main.class.getModule());
    }
}

// Unnamed module
// For backwards compatibility

// $ cd modern-java/modules/modulefour/build
// $ java -cp ./libs/modulefour.jar com.modulefour.Main

// Automatic module
// $ java --module-path libs -m modulefour/com.modulefour.Main