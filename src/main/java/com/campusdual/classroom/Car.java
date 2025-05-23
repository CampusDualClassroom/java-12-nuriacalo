package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primeiro ten que estar detido");
        }
    }

    public void accelerate() {
        if (this.speedometer < MAX_SPEED) {
            this.speedometer += 5;
            if (this.speedometer > MAX_SPEED) {
                this.speedometer = MAX_SPEED;
            }
        }
    }

    public void brake() {
        if (this.speedometer > 0) {
            this.speedometer -= 5;
            if (this.speedometer < 0) {
                this.speedometer = 0;
            }
        }
    }

    public void turnAngleOfWheels(int angle) {
        this.wheelsAngle += angle;
        if (this.wheelsAngle > 45) {
            this.wheelsAngle = 45;
        } else if (this.wheelsAngle < -45) {
            this.wheelsAngle = -45;
        }
    }

    public String showSteeringWheelDetail() {
        return Utils.string(this.wheelsAngle);
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if (reverse && this.speedometer == 0) {
            this.gear = "R";
            this.reverse = true;
        } else {
            this.reverse = false;
            this.gear = "N";
        }
    }

    public void showDetails() {
        System.out.println("Marca: " + brand + ", Modelo: " + model + ", Combustible: " + fuel);
        System.out.println("Velocidade: " + speedometer + " km/h, Revolucions: " + tachometer);
        System.out.println("Marcha: " + gear + ", Angulo ruedas: " + wheelsAngle);
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }
}
