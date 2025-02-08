public class ElonsToyCar {

    private int battery = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %s meters", convertToMeters());
    }

    public String batteryDisplay() {
        return (battery > 0) ? String.format("Battery at %s%%",battery) : "Battery empty";
    }

    public void drive() {
        battery = (battery > 0) ? battery - 1 : battery;
    }

    private int convertToMeters() {
        return (100 - battery) * 20;
    }
}
