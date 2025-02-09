import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    // looked florian-zeidler's solution
    // https://exercism.org/tracks/java/exercises/remote-control-competition/solutions/florian-zeidler
    // change wasn't better but just Badass.
    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        cars.sort(ProductionRemoteControlCar::compareTo);
        return cars; 
    }
}
