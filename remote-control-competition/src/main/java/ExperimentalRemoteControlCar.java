public class ExperimentalRemoteControlCar implements RemoteControlCar {

    // looked at sanderploegsma's solution
    // https://exercism.org/tracks/java/exercises/remote-control-competition/solutions/sanderploegsma
    // Using constants is objectivly smarter
    private static final int SPEED = 20;  
    private int distanceTravelled = 0; 

    public void drive() {
        distanceTravelled += SPEED;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}
