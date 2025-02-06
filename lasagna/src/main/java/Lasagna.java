public class Lasagna {

    private final int TIME_FOR_LASAGNA = 40;

    public int expectedMinutesInOven() {
        return TIME_FOR_LASAGNA;
    }

    public int remainingMinutesInOven(int timeLeft) {
        return expectedMinutesInOven() - timeLeft;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    public int totalTimeInMinutes(int numberOfLayers, int timeLeft) {
        return preparationTimeInMinutes(numberOfLayers) + remainingMinutesInOven(timeLeft);
    }
}
