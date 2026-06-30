abstract class Vehicle {
    abstract double fuelCost(int km);
}

class Car extends Vehicle {
    double fuelCost(int km) {
        return km * 8;   // ₹8 per km
    }
}

class Bus extends Vehicle {
    double fuelCost(int km) {
        return km * 15;  // ₹15 per km
    }
}

class Bike extends Vehicle {
    double fuelCost(int km) {
        return km * 3;   // ₹3 per km
    }
}

// New class added without changing existing code
class ElectricCar extends Vehicle {
    double fuelCost(int km) {
        return km * 2;   // ₹2 per km
    }
}

public class TransportCompany {
    public static void main(String[] args) {

        Vehicle[] fleet = {
            new Car(),
            new Bus(),
            new Bike(),
            new ElectricCar()
        };

        int km = 100;

        for (Vehicle v : fleet) {

            if (v instanceof Car)
                System.out.println("Car Fuel Cost = ₹" + ((Car) v).fuelCost(km));

            else if (v instanceof Bus)
                System.out.println("Bus Fuel Cost = ₹" + ((Bus) v).fuelCost(km));

            else if (v instanceof Bike)
                System.out.println("Bike Fuel Cost = ₹" + ((Bike) v).fuelCost(km));

            else if (v instanceof ElectricCar)
                System.out.println("Electric Car Cost = ₹" + ((ElectricCar) v).fuelCost(km));
        }
    }
}