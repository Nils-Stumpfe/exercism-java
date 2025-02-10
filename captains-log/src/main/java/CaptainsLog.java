import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    // looked at florian-zeidler's solution
    // https://exercism.org/tracks/java/exercises/captains-log/solutions/florian-zeidler
    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    // looked at florian-zeidler's solution
    // https://exercism.org/tracks/java/exercises/captains-log/solutions/florian-zeidler
    String randomShipRegistryNumber() {
        return "NCC-" + (random.nextInt(1000, 10000));
    }

    // looked at florian-zeidler's solution
    // https://exercism.org/tracks/java/exercises/captains-log/solutions/florian-zeidler
    double randomStardate() {
        return random.nextDouble(41000.0, 42000.0);
    }
}
