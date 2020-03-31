package com.company;

public class Engine {

    private int engineYear;
    private int enginePower;

    public Engine (int enginePower, int engineYear){
        this.enginePower = enginePower;
        this.engineYear = engineYear;
    }

    public int getEngineYear() {
        return engineYear;
    }

    public void setEngineYear(int engingYear) {
        this.engineYear = engingYear;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }


}
