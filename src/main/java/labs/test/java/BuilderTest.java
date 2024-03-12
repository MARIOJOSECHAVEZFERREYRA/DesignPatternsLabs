import org.example.LabsTP.LabN1.Builder.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BuilderTest {
    @Test
    public void main() {
        CarBuilder builder = new CarBuilder();
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(7);
        builder.setEngine(new Engine(1, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
        Car car = builder.getResult();

        Assertions.assertEquals(car.toString(), "Тип машины: SPORTS_CAR\n" +
                "Количество сидений: 7\n" +
                "Трансмиссия: SEMI_AUTOMATIC\n" +
                "Осталось бензина: 0.0\n" +
                "org.example.LabsTP.LabN1.Builder.Engine@75881071");
    }
}
