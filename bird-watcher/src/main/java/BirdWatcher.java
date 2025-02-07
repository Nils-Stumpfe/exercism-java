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
        return Arrays.stream(birdsPerDay, 0, Math.min(birdsPerDay.length, numberOfDays)).sum();
    }

    public int getBusyDays() {
        return Arrays.stream(birdsPerDay).reduce(0, (count, day) -> count += (day > 4) ? 1: 0);
    }
}
