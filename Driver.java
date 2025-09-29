class Car {
    private Driver driver;   

    public Car(Driver driver) {
        this.driver = driver;
    }

    public void showDriver() {
        System.out.println("This car is driven by: " + driver.getName());
    }
}

class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    
    public void drive(Car car) {
        System.out.println(name + " is driving the car.");
        car.showDriver();
    }

    
    public static void main(String[] args) {
        Driver driver = new Driver("John");
        Car car = new Car(driver); 

        driver.drive(car);          
    }
}
