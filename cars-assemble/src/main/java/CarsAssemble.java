public class CarsAssemble {

    private static final int HOURLY_PRODUCTION_RATE = 221;

    public double productionRatePerHour(int speed) {
        return (speed * HOURLY_PRODUCTION_RATE) * getSuccessRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }

    // looked at rabestro's solution
    // https://exercism.org/tracks/java/exercises/cars-assemble/solutions/rabestro
    private double getSuccessRate(int speed) {
        return (speed < 5) ? 1.0 
            : (speed < 9) ? 0.9
            : (speed == 9) ? 0.8 
            : 0.77;

    }
}
