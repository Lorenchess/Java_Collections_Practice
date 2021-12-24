package Comparison;

import java.util.Objects;

public class Car {

    private String make;

    private String model;

    private int mileage;

    @Override
    public boolean equals(Object obj) {
        Car c = (Car) obj;
        System.out.format("Comparing %s %s with %s %s %n",
                             this.make, this.model, c.make, c.model);


        if (this == obj) return true;
        if (!(obj instanceof Car)) return false;
        Car car = (Car) obj;
        return getMake().equals(car.getMake()) && getModel().equals(car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMake(), getModel());
    }

    public Car(String make, String model, int mileage) {
        super();
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + "]";
    }

} 