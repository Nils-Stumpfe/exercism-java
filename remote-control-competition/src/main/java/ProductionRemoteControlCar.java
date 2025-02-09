public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {


    // looked at sanderploegsma's solution
    // https://exercism.org/tracks/java/exercises/remote-control-competition/solutions/sanderploegsma
    private static final int SPEED = 10;  
    private int distanceTravelled = 0; 
    private int numberOfVictories = 0;

    public void drive() {
        distanceTravelled += SPEED;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    // looked at nyxenn's solution and florian-zeidler's solution
    // https://exercism.org/tracks/java/exercises/remote-control-competition/solutions/nyxenn
    // https://exercism.org/tracks/java/exercises/remote-control-competition/solutions/florian-zeidler
    // Forgor Exception, didn't understand compareTo.
    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        if (other == null) {
            throw new NullPointerException();
        }
        return other.getNumberOfVictories() - numberOfVictories;
    }
}
