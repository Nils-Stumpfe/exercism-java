public class CarsAssemble {

    private static final int PRODUCTION_RATE = 221;
    private static final int[] SUCCES_RATE= {0, 100, 100, 100, 100, 90, 90, 90, 90, 80, 77};

    public double productionRatePerHour(int speed) {
        return (speed * PRODUCTION_RATE) * getSuccesRate(speed);
    }

    public double getSuccesRate(int speed) {
        return (double) SUCCES_RATE[speed] / 100;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
