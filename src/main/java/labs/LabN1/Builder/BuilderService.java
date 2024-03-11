package labs.LabN1.Builder;

public class BuilderService {

    public void exec() {

        CarBuilder carBuilder1 = new CarBuilder();
        carBuilder1.setCarType(CarType.SUV);
        carBuilder1.setSeats(3);
        carBuilder1.setEngine(new Engine(3.0, 0));
        carBuilder1.setTransmission(Transmission.SEMI_AUTOMATIC);
        carBuilder1.setTripComputer(new TripComputer());
        carBuilder1.setGPSNavigator(new GPSNavigator());
        Car Audi = carBuilder1.getResult();
        Audi.setFuel(100);
        Audi.getTripComputer().showStatus();
        System.out.println(Audi.toString());
        Audi.getEngine().on();
        Audi.getTripComputer().showStatus();

        System.out.println("---");

        CarBuilder carBuilder2 = new CarBuilder();
        carBuilder2.setCarType(CarType.CITY_CAR);
        carBuilder2.setSeats(4);
        carBuilder2.setEngine(new Engine(3.0, 0));
        carBuilder2.setTransmission(Transmission.AUTOMATIC);
        carBuilder2.setTripComputer(new TripComputer());
        carBuilder2.setGPSNavigator(new GPSNavigator());
        Car BMW = carBuilder2.getResult();
        BMW.setFuel(322);
        System.out.println(BMW.toString());


    }

}