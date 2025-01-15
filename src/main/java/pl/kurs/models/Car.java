package pl.kurs.models;

import java.util.Objects;

public class Car {
    private String producer;
    private String model;
    private int currentSpeedKmh;

    public Car(String producer, String model, int currentSpeedKmh) {
        this.producer = producer;
        this.model = model;
        this.currentSpeedKmh = currentSpeedKmh;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCurrentSpeedKmh() {
        return currentSpeedKmh;
    }

    public void setCurrentSpeedKmh(int currentSpeedKmh) {
        this.currentSpeedKmh = currentSpeedKmh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return currentSpeedKmh == car.currentSpeedKmh && Objects.equals(producer, car.producer) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, currentSpeedKmh);
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", currentSpeedKmh=" + currentSpeedKmh +
                '}';
    }


    public void accelerate() {
        currentSpeedKmh += 10;
    }

    public void decelerate() {
        currentSpeedKmh -= 10;
    }

}
