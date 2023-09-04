public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Forward");
        Car bmw = new Car("BMW M5");
        Car camry = new Car("Toyota Camry");
        Truck truck1 = new Truck("KAMAZ");
        Truck truck2 = new Truck("MAZ", 8);
        Transport[] transports = {
                bicycle,
                bmw,
                camry,
                truck1,
                truck2

        };
        ServiceStantion serviceStantion = new ServiceStantion();
        for (Transport transport : transports) {
            serviceStantion.check(transport);
        }
    }
}