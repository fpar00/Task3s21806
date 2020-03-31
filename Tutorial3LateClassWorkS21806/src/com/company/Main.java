package com.company;

public class Main {

    public static void main(String[] args) {
        Airplane airplane1;
        airplane1 = new Airplane("united",256);

        String brand = airplane1.getBrand();
        int seatNumber = airplane1.getSeatNumber();

        Engine engine1;
        engine1 = new Engine(2010, 2010);

        int engineYear = engine1.getEngineYear();
        int enginePower = engine1.getEnginePower();

        if (engineYear > 2000) {
            if (enginePower > 2000){
                System.out.println("This Airplane is Eco.");
            }
        } else {
            System.out.println("This Airplane is not Eco.");
        }

        System.out.println("Plane is: " + " with " + seatNumber + " seats." );


        }
    }

