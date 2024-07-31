package com.coma102.helloworld;

public class JavaClassMain1 {
    public static void main(String[] args) {
        Car myCar = new Car("Red", "Diesel", 1.2f);
        Car myCar1 = new Car("White", "Gasoline", 1.6f);

        System.out.println(myCar.color);
        myCar.askFuelType();
        System.out.println(myCar.engine_capacity);

        System.out.println(myCar1.color);
        myCar1.askFuelType();
        System.out.println(myCar1.engine_capacity);

        sedanCar newCar = new sedanCar("Red", "Diesel", 1.2f, 40);
        newCar.askFuelType();
        System.out.println(newCar.b_Vol);
    }

    public static class Car {
        String color;
        String fuel_type;
        float engine_capacity;
        public Car(String carColor, String carFuelType, float CarEngineCapacity){
            color = carColor;
            fuel_type = carFuelType;
            engine_capacity = CarEngineCapacity;
        }

        public void askFuelType() {
            System.out.println(fuel_type);
        }
    }

    public static class sedanCar extends Car {
        int b_Vol;
        public sedanCar(
                String carColor, String carFuelType, float CarEngineCapacity, int baggageVol
        ) {
            super(carColor, carFuelType, CarEngineCapacity);
            b_Vol = baggageVol;
        }
    }
}
