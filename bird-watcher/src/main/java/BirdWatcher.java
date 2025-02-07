import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
       return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    // the following methods are copied from bobahop's solution uon Exercsim 
    // https://exercism.org/tracks/java/exercises/bird-watcher/solutions/bobahop 
    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).anyMatch(day -> day == 0 );
    }

    public int getCountForFirstDays(int numberOfDays) {
        return Arrays.stream(birdsPerDay).limit(numberOfDays).sum();
    }

    public int getBusyDays() {
        return (int) Arrays.stream(birdsPerDay).filter(a -> a >= 5).count();
    }
}
