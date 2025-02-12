public class GameMaster {

    public String describe (Character character) {
        return String.format("You're a level %s %s with %s hit points.", 
                            character.getLevel(), 
                            character.getCharacterClass(), 
                            character.getHitPoints());
    }

    public String describe (Destination destination) {
        return String.format("You've arrived at %s, which has %s inhabitants.",
                            destination.getName(), 
                            destination.getInhabitants());
    }

    public String describe (TravelMethod travelMethod) {
        return switch (travelMethod) {
            case WALKING -> "You're traveling to your destination by walking.";
            case HORSEBACK -> "You're traveling to your destination on horseback.";
        };
    }

    // looked at kimggor's solution for simplicity
    // https://exercism.org/tracks/java/exercises/wizards-and-warriors-2/solutions/kimggor
    public String describe (Character character, Destination destination, TravelMethod travelMethod) {
        return String.join(" ",  this.describe(character), this.describe(travelMethod), this.describe(destination));
    }

    public String describe (Character character, Destination destination) {
        return this.describe(character, destination, TravelMethod.WALKING);
    }
}
