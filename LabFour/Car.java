class Car {
    String brand;
    String model;
    double price;
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;

    }
    void displayCar() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Price: BDT " + price);
    }
    public static void main(String[] args) {
        Car myCar = new Car("CCE", "CCE Car 1", 542000);
        myCar.displayCar();
    }
}
