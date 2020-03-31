package com.company;

public class Airplane {
    private String brand;
    private int seatNumber;

    public Airplane(String brand, int seatNumber){
        this.brand = brand;
        this.seatNumber = seatNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
