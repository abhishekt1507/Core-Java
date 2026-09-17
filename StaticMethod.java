class Car {
    static void kmIntoMiles() {
        System.out.println("Converting Km into Miles");
    }

    void calculateMileage() {
        System.out.println("Calculating Mileage");
    }

}

class StaticMethod {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.calculateMileage();
        Car.kmIntoMiles();
    }

}