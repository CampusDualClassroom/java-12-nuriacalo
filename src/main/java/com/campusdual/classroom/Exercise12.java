package com.campusdual.classroom;

public class Exercise12 {

    public static void main(String[] args) {
        Car myCar = new Car("Citroën", "Xara", "Diésel");

        myCar.start();
        myCar.accelerate();
        myCar.accelerate();
        myCar.turnAngleOfWheels(20);
        myCar.turnAngleOfWheels(30);

        myCar.brake();
        myCar.brake();

        myCar.setReverse(true);

        myCar.showDetails();

        myCar.stop();
    }

}