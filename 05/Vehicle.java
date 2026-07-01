class Vehicle {
    public String startEngine() {
        return "Vehicle engine started";
    }
}

class Car extends Vehicle {
    @Override
    public String startEngine() {
        return "Car engine roars";
    }
}

class Motorcycle extends Vehicle {
    @Override
    public String startEngine() {
        return "Motorcycle engine revs";
    }
}

