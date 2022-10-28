public class Main {

    public static void main(String[] args) {
        Car c1 = new GasolineCar("BK46470", "Ford", "Fiesta 2011", 5, 21);
        Car c2 = new DieselCar("DK93221", "Ford", "Armstrong 2004", 5, 14, false);
        Car c3 = new ElectricCar("LP014421", "Audi", "E2 2021", 4, 2000, 100, 12);

        FleetOfCars Fleet = new FleetOfCars();
        Fleet.addCar(c1);
        Fleet.addCar(c2);
        Fleet.addCar(c3);
        System.out.println(Fleet);
    }
}