class NeedForSpeed {

    private int speed;
    private int metersDriven = 0;
    private int batteryDrain;
    private int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
       this.speed = speed;
       this.batteryDrain = batteryDrain;
    }

    public int getbatteryDrain() {
        return batteryDrain;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean batteryDrained() {
        return (battery >= batteryDrain) ? false : true;
    }

    public int distanceDriven() {
        return metersDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
       metersDriven += speed;
       battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return (distance > ((100 / car.getbatteryDrain()) * car.getSpeed())) ? false : true;
    }
}
